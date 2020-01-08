package com.example.demojava8.designmethod.bridge.dto.child;

import com.example.demojava8.designmethod.bridge.dto.Clothing;
import com.example.demojava8.designmethod.bridge.dto.Person;

/**
 * @ClassName: Jacket
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:16
 * @Version 1.0
 **/
public class Jacket extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}
