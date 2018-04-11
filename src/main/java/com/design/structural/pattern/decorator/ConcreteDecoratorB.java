package com.design.structural.pattern.decorator;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public class ConcreteDecoratorB extends Decorator {
    private Component component;
    public ConcreteDecoratorB(Component component) {
        super(component);
        this.component = component;
    }

    @Override
    public void doSomething() {
        System.out.println("B装饰者也可以用来改写doSomething方法！");
    }

    @Override
    public void doAnything() {
        component.doAnything();
    }
}
