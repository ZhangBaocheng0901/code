package com.drivingschool.drivingschool_management_system.controller;

import com.drivingschool.entity.Coach;
import com.drivingschool.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 教练管理控制器
 * 处理与教练相关的 HTTP 请求
 */
@RestController // 标记为 RESTful 控制器
@RequestMapping("/api/coaches") // 定义基础路径
public class CoachController {

    @Autowired // 自动注入 CoachService
    private CoachService coachService;

    /**
     * 新增教练
     * @param coach 前端传递的教练数据（JSON 格式）
     * @return 操作是否成功
     */
    @PostMapping
    public boolean addCoach(@RequestBody Coach coach) {
        return coachService.save(coach);
    }

    /**
     * 根据ID查询教练
     * @param id 教练ID（路径参数）
     * @return 教练信息
     */
    @GetMapping("/{id}")
    public Coach getCoach(@PathVariable Long id) {
        return coachService.getById(id);
    }
}
