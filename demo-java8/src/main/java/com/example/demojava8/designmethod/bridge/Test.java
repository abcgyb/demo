package com.example.demojava8.designmethod.bridge;

import com.example.demojava8.designmethod.bridge.dto.Clothing;
import com.example.demojava8.designmethod.bridge.dto.Person;
import com.example.demojava8.designmethod.bridge.dto.child.Jacket;
import com.example.demojava8.designmethod.bridge.dto.child.Lady;
import com.example.demojava8.designmethod.bridge.dto.child.Man;
import com.example.demojava8.designmethod.bridge.dto.child.Trouser;

/**
 * @ClassName: Test
 * @Description: 桥接模式(需要重新研究)
 * @Author: GaoYueBin
 * @Date: 2019-12-09 13:56
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("桥接模式:测试方法--------------------------");
        Person man = new Man();
        Person lady = new Lady();
        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();
        jacket.personDressCloth(man);
        trouser.personDressCloth(lady);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(man);
    }
}
