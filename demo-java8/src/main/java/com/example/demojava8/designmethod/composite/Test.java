package com.example.demojava8.designmethod.composite;

import com.example.demojava8.designmethod.composite.dto.Employer;
import com.example.demojava8.designmethod.composite.dto.impl.Programmer;
import com.example.demojava8.designmethod.composite.dto.impl.ProjectAssistant;
import com.example.demojava8.designmethod.composite.dto.impl.ProjectManager;

import java.util.List;

/**
 * @ClassName: Test
 * @Description: 组合模式
 * @Author: GaoYueBin
 * @Date: 2019-12-09 14:33
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序猿1");
        Employer programmer2 = new Programmer("程序猿2");

        pm.add(pa);
        pm.add(programmer1);
        pm.add(programmer2);
        List<Employer> employers = pm.getEmployers();
        employers.stream().forEach(item -> {
            System.out.println(item.getName());
        });
    }
}
