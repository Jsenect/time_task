package com.lzz.time_task.task;

import com.lzz.time_task.dao.CronDao;
import com.lzz.time_task.dao.UserDao;
import com.lzz.time_task.entity.TaskCron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author zzl
 * @Date 2020/4/26 11:02
 * 基础数据库的corn表达式
 */
//@Configuration
@EnableScheduling
public class DynamicScheduleTask implements SchedulingConfigurer {

    @Autowired
    CronDao cronDao;


    /**
     * 这个是从数据库中取出相关的corn表达式并且 定时的执行这个定时任务,这里可一个动态的去修改数据库的corn表达式
     * @param scheduledTaskRegistrar
     *         scheduledTaskRegistrar.addTriggerTask(Runnable task,Trigger trigger);
     *         task是你需要执行的任务,Trigger是一个触发器的时间
     *         runnable是一个线程的执行接口
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {


        scheduledTaskRegistrar.addTriggerTask(
                //1.添加任务内容(Runnable)
                () -> System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime()),
                //2.设置执行周期(Trigger)
                triggerContext -> {
                    //2.1 从数据库获取执行周期
                    Optional<TaskCron> byId = cronDao.findById(1L);

                    TaskCron taskCron = byId.get();
                    String cron = taskCron.getCron();
                    //2.2 合法性校验.
                    if (StringUtils.isEmpty(cron)) {
                        // Omitted Code ..
                    }
                    //2.3 返回执行周期(Date)

                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
    }
}
