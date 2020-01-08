package com.example.demoshiro.jpa;

import com.example.demoshiro.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: StudentRepository
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-29 16:14
 * @Version 1.0
 **/
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
