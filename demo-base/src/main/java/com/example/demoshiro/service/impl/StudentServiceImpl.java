package com.example.demoshiro.service.impl;

import com.example.demoshiro.dto.Student;
import com.example.demoshiro.mapper.StudentInterface;
import com.example.demoshiro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: StudentServiceImpl
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-13 16:45
 * @Version 1.0
 **/

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentInterface studentInterface;

    /**
     * @Author GaoYueBin
     * @Description 查询全部学生
     * @Date 2018/11/13 16:44
     * @Param
     * @return
     **/
    @Override
    public List<Student> query(String name) {
        List<Student> result = studentInterface.queryAll(name);
        return result;
    }

    /**
     * @Author GaoYueBin
     * @Description 根据学生姓名更新学生信息
     * @Date 2018/11/14 9:33
     * @Param
     * @return
     **/
    @Override
    public void update(String name) {
        studentInterface.updateInfoByName(name);
    }

    /**
     * @Author GaoYueBin
     * @Description main方法测试
     * @Date 2018/11/16 11:13
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        int i=0;
        while (i<101){
            num.add(i);
            i++;
        }
        List<Integer> result = num.stream().filter(item ->
                item % 2 != 0
        ).collect(Collectors.toList());
        System.out.println("相加的结果为：" + result);
    }
}
