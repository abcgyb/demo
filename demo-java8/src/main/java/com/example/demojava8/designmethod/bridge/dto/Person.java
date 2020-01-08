package com.example.demojava8.designmethod.bridge.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Person
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:00
 * @Version 1.0
 **/
@Setter
@Getter
public abstract class Person {

    private Clothing clothing;

    private String type;

    //public abstract void dress();
}
