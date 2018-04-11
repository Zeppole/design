package com.design.structural.pattern.decorator;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorA.doSomething();
        decoratorA.doNewThing();
        decoratorB.doSomething();
        decoratorB.doAnything();
    }
}
