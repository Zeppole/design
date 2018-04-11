package com.design.structural.pattern.decorator;

/**
 * @author dingdong
 * @date 2018/4/11.
 */
public class ConcreteComponent extends Component {

    public void doOtherThing(){
        System.out.println("这是扩展组件的方法");
    }

    @Override
    public void doSomething(){
        System.out.println("这是组件中的doSomething重写吧！");
    }

    @Override
    public void doAnything(){
        System.out.println("这是组件中的doAnything重写！");
    }
}
