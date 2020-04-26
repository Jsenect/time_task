package com.lzz.time_task.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zzl
 * @Date 2020/4/22 15:32
 */
@Data
@Entity
public class Dept {
    @Id
    @GeneratedValue
    private String id;

    private String name;

    private String address;

    private Integer enable;

}
