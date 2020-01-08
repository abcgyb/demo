package com.example.demojava8.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Artist
 * @Description: 艺术家对象
 * @Author: GaoYueBin
 * @Date: 2019-10-09 15:13
 * @Version 1.0
 **/
@Setter
@Getter
@AllArgsConstructor
public class Artist {

    //来自
    private String from;

    //姓名
    private String name;

    //年龄
    private int age;

    //身高
    private int heigth;
}
