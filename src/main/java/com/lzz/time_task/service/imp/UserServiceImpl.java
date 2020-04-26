package com.lzz.time_task.service.imp;

import com.lzz.time_task.dao.UserDao;
import com.lzz.time_task.entity.SysUser;
import com.lzz.time_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<SysUser> findAll() {
        return userDao.findAll();
    }
}
