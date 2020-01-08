package com.example.demojava8.designmethod.abstractfactory;

import com.example.demojava8.designmethod.abstractfactory.animal.Cat;
import com.example.demojava8.designmethod.abstractfactory.animal.Dog;

/**
 * @ClassName: AnimalFactoryInterFace
 * @Description: 抽象工厂模式
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:15
 * @Version 1.0
 **/
public interface AnimalFactoryInterFace {

    Cat createCat();

    Dog createDog();
}
