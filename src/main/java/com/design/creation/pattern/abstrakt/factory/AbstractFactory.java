package com.design.creation.pattern.abstrakt.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public interface AbstractFactory {

    /**
     * 注入CakeMaker，如果工厂需要生产不同的对象，则只需要注入不同的实例即可！
     * @param cakeMaker cakeMaker
     */
    void setCakeMaker(CakeMaker cakeMaker);

    /**制作蛋糕-业务处理逻辑*/
    void makeCake();
}
