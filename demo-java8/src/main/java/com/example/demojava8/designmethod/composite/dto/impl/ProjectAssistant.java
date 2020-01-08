package com.example.demojava8.designmethod.composite.dto.impl;

import com.example.demojava8.designmethod.composite.dto.Employer;

/**
 * @ClassName: ProjectAssistant
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 16:22
 * @Version 1.0
 **/
public class ProjectAssistant extends Employer {
    public ProjectAssistant(String name) {
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
