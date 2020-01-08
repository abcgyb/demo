package com.example.demojava8.designmethod.bridge.dto.child;

import com.example.demojava8.designmethod.bridge.dto.Clothing;
import com.example.demojava8.designmethod.bridge.dto.Person;

/**
 * @ClassName: Lady
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:14
 * @Version 1.0
 **/
public class Lady extends Person {

    public Lady() {
        setType("女人");
    }

    //@Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
