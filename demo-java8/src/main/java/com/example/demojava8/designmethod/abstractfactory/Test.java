package com.example.demojava8.designmethod.abstractfactory;

import com.example.demojava8.designmethod.abstractfactory.animal.Cat;
import com.example.demojava8.designmethod.abstractfactory.animal.Dog;
import com.example.demojava8.designmethod.abstractfactory.animal.impl.BlackAnimalFactory;
import com.example.demojava8.designmethod.abstractfactory.animal.impl.WhiteAnimalFactory;

/**
 * @ClassName: Test
 * @Description: 抽象工厂模式
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:28
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AnimalFactoryInterFace whiteFactory = new WhiteAnimalFactory();
        Cat whiteCat = whiteFactory.createCat();
        Dog whiteDog = whiteFactory.createDog();
        whiteCat.eat();
        whiteDog.bark();

        AnimalFactoryInterFace blackFactory = new BlackAnimalFactory();
        Cat blackCat = blackFactory.createCat();
        Dog blackDog = blackFactory.createDog();
        blackCat.eat();
        blackDog.bark();

    }
}
