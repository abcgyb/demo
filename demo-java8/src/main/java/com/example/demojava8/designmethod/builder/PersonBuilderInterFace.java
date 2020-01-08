package com.example.demojava8.designmethod.builder;

import com.example.demojava8.designmethod.builder.dto.Person;

/**
 * @ClassName: PersonBuilderInterFace
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:50
 * @Version 1.0
 **/
public interface PersonBuilderInterFace {

    void buildeHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
