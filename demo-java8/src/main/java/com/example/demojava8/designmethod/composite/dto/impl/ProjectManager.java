package com.example.demojava8.designmethod.composite.dto.impl;

import com.example.demojava8.designmethod.composite.dto.Employer;

import java.util.ArrayList;

/**
 * @ClassName: ProjectManager
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 16:26
 * @Version 1.0
 **/
public class ProjectManager extends Employer {
    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList<>();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
