package com.design.structural.pattern.adapter;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public class AdapteeImpl implements Adaptee {
    @Override
    public int getAmpere() {
        return 10;
    }

    @Override
    public int getVoltage() {
        return 220;
    }
}
