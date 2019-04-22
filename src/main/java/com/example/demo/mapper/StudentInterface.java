package com.example.demo.mapper;

import com.example.demo.dto.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: StudentInterface
 * @Description: 学生类持久层操作接口层
 * @Author: GaoYueBin
 * @Date: 2018-11-13 16:27
 * @Version 1.0
 **/
public interface StudentInterface {

    List<Student> queryAll(@Param("studentName") String studentName);

    void updateInfoByName(@Param("name") String  name);
}
