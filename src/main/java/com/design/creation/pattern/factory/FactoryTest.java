package com.design.creation.pattern.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class FactoryTest {

    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();
        String type = "cheese";
        CakeMaker cakeMaker = factory.getCakeMaker(type);
        cakeMaker.makeCake();
    }
}
