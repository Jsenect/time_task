package com.lzz.time_task.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zzl
 * @Date 2020/4/26 11:20
 */
@Entity
@Data
public class TaskCron {
    @Id
    @GeneratedValue
    private long id;

    private String cron;
}
