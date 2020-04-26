package com.lzz.time_task.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zzl
 * @Date 2020/4/22 15:41
 */
@Entity
@Table(name = "sys_road")
@Data
public class Road {
    @Id
    @GeneratedValue
    private String id;

    private String name;
}
