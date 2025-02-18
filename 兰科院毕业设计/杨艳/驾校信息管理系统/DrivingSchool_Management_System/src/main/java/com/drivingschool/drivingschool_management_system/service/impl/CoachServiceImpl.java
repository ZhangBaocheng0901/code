package com.drivingschool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.drivingschool.entity.Coach;
import com.drivingschool.mapper.CoachMapper;
import com.drivingschool.service.CoachService;
import org.springframework.stereotype.Service;

/**
 * 教练服务实现类
 * 继承 MyBatis-Plus 的 ServiceImpl，实现 CoachService 接口
 */
@Service // 标记为 Spring 的 Service 组件
public class CoachServiceImpl
        extends ServiceImpl<CoachMapper, Coach>
        implements CoachService {
    // 无需编写基础 CRUD 方法，已由父类实现
}