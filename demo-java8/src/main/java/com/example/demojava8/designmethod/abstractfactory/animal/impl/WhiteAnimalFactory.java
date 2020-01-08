package com.example.demojava8.designmethod.abstractfactory.animal.impl;

import com.example.demojava8.designmethod.abstractfactory.AnimalFactoryInterFace;
import com.example.demojava8.designmethod.abstractfactory.animal.Cat;
import com.example.demojava8.designmethod.abstractfactory.animal.Dog;

/**
 * @ClassName: WhiteAnimalFactory
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:27
 * @Version 1.0
 **/
public class WhiteAnimalFactory implements AnimalFactoryInterFace {
    @Override
    public Cat createCat() {
        return new WhiteCat();
    }

    @Override
    public Dog createDog() {
        return new WhiteDog();
    }
}
