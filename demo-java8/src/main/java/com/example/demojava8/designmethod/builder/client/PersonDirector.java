package com.example.demojava8.designmethod.builder.client;

import com.example.demojava8.designmethod.builder.PersonBuilderInterFace;
import com.example.demojava8.designmethod.builder.dto.Person;

/**
 * @ClassName: PersonDirector
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 17:31
 * @Version 1.0
 **/
public class PersonDirector {

    public Person constructPerson(PersonBuilderInterFace personBuilderInterFace) {
        personBuilderInterFace.buildeHead();
        personBuilderInterFace.buildBody();
        personBuilderInterFace.buildFoot();
        return personBuilderInterFace.buildPerson();
    }
}
