package com.example.demojava8.designmethod.mediator.impl;

import com.example.demojava8.designmethod.mediator.Colleague;

/**
 * @ClassName: ColleagueB
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-20 17:17
 * @Version 1.0
 **/
public class ColleagueB implements Colleague {

    @Override
    public void action() {
        System.out.println("前台注意了!");
    }
}
