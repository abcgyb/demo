package com.example.demojava8.designmethod.composite.dto.impl;

import com.example.demojava8.designmethod.composite.dto.Employer;

/**
 * @ClassName: Programmer
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 16:12
 * @Version 1.0
 **/
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
