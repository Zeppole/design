package com.design.structural.pattern.adapter;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Adaptee adaptee = new AdapteeImpl();
        Adapter adapter = new PowerAdapter(adaptee);
        int ampere = adapter.getAmpere();
        int voltage = adapter.getVoltage();
        System.out.println("电源适配器的输入电压为："+voltage+",电流为："+ampere);
    }
}
