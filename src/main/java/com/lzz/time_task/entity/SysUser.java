package com.lzz.time_task.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author zzl
 * @Date 2020/4/22 14:02
 */
@Data
@Entity
/**
 * 生成表时的名称
 */
@Table(name = "sys_user")
public class SysUser {
    //标注主键
    @Id
    /**
     * 自动生成值
     */
    @GeneratedValue
    private Long id;

    private String name;

    /**
     * 当实体类的名称和表名不同时映射的作用
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 表示一个简单的属性,到数据库的映射的时候,对于没有任何标注getxxx的方法,默认即为basic
     * fetch 表示该属性的读取策略,有eager 和lazy两种,分别表示主支抓取和延迟加载 默认为立即抓取
     * optional:  表示该属性是否允许默认值
     */
    @Basic(fetch = FetchType.EAGER)
    private String myself;


}
