package com.design.structural.pattern.adapter;

/**
 * 三星电源适配器
 * @author dingdong
 * @date 2018/4/11.
 */
public class PowerAdapter implements Adapter {
    private Adaptee adaptee;

    public PowerAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int getAmpere() {
        int ampere = adaptee.getAmpere();
        int result = ampere/10;
        System.out.println(ampere+ "A电流适配为三星电源输入电流："+ result +"A");
        return result;
    }

    @Override
    public int getVoltage() {
        int voltage = adaptee.getVoltage();
        int result = voltage/10;
        System.out.println(voltage+ "V电压适配为三星电源输入电压："+ result +"V");
        return result;
    }
}
