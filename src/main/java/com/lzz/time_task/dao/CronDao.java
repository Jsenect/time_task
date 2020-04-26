package com.lzz.time_task.dao;

import com.lzz.time_task.entity.TaskCron;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author zzl
 * @Date 2020/4/26 11:21
 */
public interface CronDao extends JpaRepository<TaskCron,Long> {


}
