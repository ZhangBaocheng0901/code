package com.drivingschool.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.drivingschool.entity.Coach;

/**
 * 教练服务接口
 * 继承 MyBatis-Plus 的 IService 接口，提供基础 CRUD 方法
 */
public interface CoachService extends IService<Coach> {
    // 可在此扩展自定义方法（如复杂查询）
}