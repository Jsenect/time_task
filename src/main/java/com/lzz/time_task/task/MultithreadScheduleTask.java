package com.lzz.time_task.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 多线程创建任务类
 * 多个线程执行互不影响
 *
 * @author zzl
 * @Date 2020/4/26 13:01
 */
@Component
@EnableScheduling //开启定时任务
@EnableAsync    //开启多线程
public class MultithreadScheduleTask {

    @Async
    @Scheduled(fixedDelay = 1000)   //间隔一秒
    public void first() throws InterruptedException {
        System.out.println("第一个任务执行开始: " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
        System.out.println();
        Thread.sleep(1000 * 10);
    }

    @Async
    @Scheduled(fixedDelay = 1000)   //间隔一秒
    public void second() throws InterruptedException {
        System.out.println("第二个任务执行开始: " + LocalDateTime.now().toLocalTime() + "\r\n线程 : " + Thread.currentThread().getName());
        System.out.println();
    }

}
