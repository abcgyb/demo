package com.example.demojava8.designmethod.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Prototype
 * @Description: 原型类
 * @Author: GaoYueBin
 * @Date: 2019-12-09 10:12
 * @Version 1.0
 **/
@Setter
@Getter
public class Prototype implements Cloneable {

    private String name;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
