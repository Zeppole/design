package com.design.structural.pattern.decorator;

/**
 * 装饰者继承了component组件，并同时拥有component组件
 * @author dingdong
 * @date 2018/4/11.
 */
public class ConcreteDecoratorA extends Decorator {
    private Component component;
    public ConcreteDecoratorA(Component component) {
        super(component);
        this.component = component;
    }

    public void doNewThing(){
        System.out.println("装饰者新增的方法，这是重点关注的！");
    }

    @Override
    public void doSomething() {
        System.out.println("A重写doSomething方法");
    }

    @Override
    public void doAnything() {
        System.out.println("A重写doAnything方法");
    }
}
