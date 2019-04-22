package com.example.demo.jpa;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: StudentRepository
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-29 16:14
 * @Version 1.0
 **/
public interface StudentRepository  extends JpaRepository<StudentEntity,Integer> {
}
