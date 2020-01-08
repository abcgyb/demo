package com.example.demojava8.designmethod.bridge.dto.child;

import com.example.demojava8.designmethod.bridge.dto.Clothing;
import com.example.demojava8.designmethod.bridge.dto.Person;

/**
 * @ClassName: Man
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:08
 * @Version 1.0
 **/
public class Man extends Person {
    public Man() {
        setType("男人");
    }

    //@Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
