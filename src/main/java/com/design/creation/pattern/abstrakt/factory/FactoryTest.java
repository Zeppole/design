package com.design.creation.pattern.abstrakt.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class FactoryTest {

    public static void main(String[] args) {
        CakeMaker cakeMaker = new CheeseCake();
        AbstractFactory factory = new CakeFactory();
        factory.setCakeMaker(cakeMaker);
        factory.makeCake();
    }
}
