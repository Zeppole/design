package com.design.creation.pattern.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class CheeseCake implements CakeMaker {

    @Override
    public void makeCake() {
        System.out.println("制作芝士蛋糕！");
    }
}
