package com.design.creation.pattern.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class MousseCake implements CakeMaker {

    @Override
    public void makeCake() {
        System.out.println("制作慕斯蛋糕！");
    }
}
