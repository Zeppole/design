package com.design.structural.pattern.decorator;

/**
 * 基类一般为抽象类或接口，抽象类的好处是其子类不必都实现其方法，父类中的方法是大家共有的
 * @author dingdong
 * @date 2018/4/11.
 */
public abstract class Component {

    public void doSomething(){
        System.out.println("这是组件中的doSomething方法，被装饰者共有的方法，有不同的就去重写吧！");
    }

    public void doAnything(){
        System.out.println("这是组件中的doAnything方法，被装饰者共有的方法，有不同的就去重写吧！");
    }

}
