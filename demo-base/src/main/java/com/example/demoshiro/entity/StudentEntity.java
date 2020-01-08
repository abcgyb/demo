package com.example.demoshiro.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName: StudentEntity
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-29 15:54
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 名称
     */
    @Column
    private String name;

    /**
     * 年龄
     */
    @Column
    private String age;

}
