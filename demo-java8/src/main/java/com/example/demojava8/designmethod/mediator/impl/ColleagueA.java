package com.example.demojava8.designmethod.mediator.impl;

import com.example.demojava8.designmethod.mediator.Colleague;

/**
 * @ClassName: ColleagueA
 * @Description: 员工A
 * @Author: GaoYueBin
 * @Date: 2019-12-20 17:16
 * @Version 1.0
 **/
public class ColleagueA implements Colleague {

    @Override
    public void action() {
        System.out.println("普通员工努力工作!");
    }
}
