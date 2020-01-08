package com.example.demojava8.designmethod.mediator.impl;

import com.example.demojava8.designmethod.mediator.Colleague;
import com.example.demojava8.designmethod.mediator.Mediator;

/**
 * @ClassName: ConcreteMediator
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-20 17:14
 * @Version 1.0
 **/
public class ConcreteMediator extends Mediator {

    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator() {
        this.ca = new ColleagueA();
        this.cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        //老板来了通知员工
        if (content.equals("boss")) {
            ca.action();
        }
        //客户来了通知前台
        if (content.equals("client")) {
            cb.action();
        }
    }
}
