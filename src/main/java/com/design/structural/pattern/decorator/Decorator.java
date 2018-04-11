package com.design.structural.pattern.decorator;

/**
 * 装饰者继承了component组件，并同时拥有component组件
 * @author dingdong
 * @date 2018/4/11.
 */
public abstract class Decorator extends Component {
    private Component component;
    public Decorator(Component component) {
        super();
        this.component = component;
    }
}
