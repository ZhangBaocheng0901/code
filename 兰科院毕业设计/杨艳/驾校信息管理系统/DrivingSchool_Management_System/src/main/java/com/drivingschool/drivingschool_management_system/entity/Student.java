package com.drivingschool.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.util.Date;

@Data
@TableName("student")
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String phone;
    @TableField("id_card")
    private String idCard;
    @TableField("enroll_time")
    private Date enrollTime;
    private String status;
}