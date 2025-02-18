package com.drivingschool.entity;

import com.baomidou.mybatisplus.annotation.IdType; // 新增导入
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("coach")
public class Coach {
    @TableId(type = IdType.AUTO) // 正确引用 IdType.AUTO
    private Long id;
    private String name;
    private String licenseNumber;
    private Integer teachingHours;
}