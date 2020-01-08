package com.example.demojava8.designmethod.builder.impl;

import com.example.demojava8.designmethod.builder.PersonBuilderInterFace;
import com.example.demojava8.designmethod.builder.dto.Person;

/**
 * @ClassName: ManBuilder
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 17:25
 * @Version 1.0
 **/
public class ManBuilder implements PersonBuilderInterFace {

    Person person;

    public ManBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildeHead() {
        person.setHead("建造男人的头部");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
