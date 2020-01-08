package com.example.demojava8.designmethod.builder;

import com.example.demojava8.designmethod.builder.client.PersonDirector;
import com.example.demojava8.designmethod.builder.dto.Person;
import com.example.demojava8.designmethod.builder.impl.ManBuilder;

/**
 * @ClassName: Test
 * @Description: 建造者模式
 * @Author: GaoYueBin
 * @Date: 2019-12-06 17:37
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
