package com.example.demojava8.designmethod.composite.dto;

import java.util.List;

/**
 * @ClassName: Employer
 * @Description: 组合模式基础对象类
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:39
 * @Version 1.0
 **/
public abstract class Employer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List<Employer> employers;

    public List<Employer> getEmployers() {
        return employers;
    }

    public void printInfo() {
        System.out.println(name);
    }
}
