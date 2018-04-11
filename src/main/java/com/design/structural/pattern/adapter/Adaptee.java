package com.design.structural.pattern.adapter;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public interface Adaptee {

    /** 获取电流*/
    int getAmpere();

    /** 获取电压*/
    int getVoltage();
}
