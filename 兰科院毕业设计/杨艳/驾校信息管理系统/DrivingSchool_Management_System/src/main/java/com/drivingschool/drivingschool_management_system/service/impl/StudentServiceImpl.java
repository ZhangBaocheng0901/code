package com.drivingschool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.drivingschool.entity.Student;
import com.drivingschool.mapper.StudentMapper;
import com.drivingschool.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl
        extends ServiceImpl<StudentMapper, Student>
        implements StudentService {
}