package com.lzz.time_task.task;

import com.sun.deploy.util.SystemUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author zzl
 * @Date 2020/4/26 10:55
 *
 */
//@Configuration
@EnableScheduling
public class TimeTask {

    @Scheduled(fixedRate = 3000)
    public void tasks() {
        System.out.println("自己写的corn表达式执行了"+ LocalDateTime.now().toLocalTime());
    }
}
