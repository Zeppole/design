package com.design.creation.pattern.abstrakt.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class CakeFactory implements AbstractFactory {

    private CakeMaker cakeMaker;

    @Override
    public void setCakeMaker(CakeMaker cakeMaker) {
        this.cakeMaker = cakeMaker;
    }

    @Override
    public void makeCake() {
        cakeMaker.makeCake();
    }
}
