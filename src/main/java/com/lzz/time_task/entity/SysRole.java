package com.lzz.time_task.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zzl
 * @Date 2020/4/22 15:37
 */
@Data
@Entity//表示要生成表
@Table(name = "sys_role")
public class SysRole {

    @Id
    @GeneratedValue
    private String id;

    private String name;
}
