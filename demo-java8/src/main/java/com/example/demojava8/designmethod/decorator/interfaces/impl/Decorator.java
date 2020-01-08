package com.example.demojava8.designmethod.decorator.interfaces.impl;

import com.example.demojava8.designmethod.decorator.interfaces.Person;

/**
 * @ClassName: Decorator
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 17:08
 * @Version 1.0
 **/
public abstract class Decorator implements Person {
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
