package com.example.cloudclient.hystrics;

import com.example.cloudclient.interfaces.BaseDatalService;
import com.example.cloudclient.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BaseDatalServiceHystric
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 18:22
 * @Version 1.0
 **/
@Component
public class BaseDatalServiceHystric implements BaseDatalService {
    @Override
    public List<Student> query(String name) {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("这个是熔断器的返回结果！");
        students.add(student);
        return students;
    }
}
