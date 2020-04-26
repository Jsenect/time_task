package com.lzz.time_task.controller;

import com.lzz.time_task.entity.SysUser;
import com.lzz.time_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zzl
 * @Date 2020/4/22 14:10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<SysUser> findAll() {
        return userService.findAll();
    }

}
