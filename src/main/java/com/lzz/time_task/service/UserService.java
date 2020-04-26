package com.lzz.time_task.service;

import com.lzz.time_task.entity.SysUser;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:09
 */
public interface UserService {
    List<SysUser> findAll();

}
