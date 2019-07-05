package com.example.demoshiro.service;

import com.example.demoshiro.dto.Student;

import java.util.List;

/**
 * @ClassName: StudentService
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-13 16:43
 * @Version 1.0
 **/
public interface StudentService {

    /**
     * @Author GaoYueBin
     * @Description 查询全部学生
     * @Date 2018/11/13 16:44
     * @Param 
     * @return 
     **/
    List<Student> query(String name);
    
    /**
     * @Author GaoYueBin
     * @Description 根据学生姓名更新学生信息
     * @Date 2018/11/14 9:33
     * @Param 
     * @return 
     **/
    void update(String name);
}
