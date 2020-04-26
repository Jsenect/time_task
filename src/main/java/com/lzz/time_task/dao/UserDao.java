package com.lzz.time_task.dao;

import com.lzz.time_task.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author zzl
 * @Date 2020/4/22 14:05
 */
@Component
public interface UserDao extends JpaRepository<SysUser,Long> {

}
