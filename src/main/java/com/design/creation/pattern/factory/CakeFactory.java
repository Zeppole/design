package com.design.creation.pattern.factory;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class CakeFactory {

    /**根据不同的参数来决定工厂要生成那种对象*/
    public CakeMaker getCakeMaker(String type){
        if("cheese".equals(type)){
            return new CheeseCake();
        }else if("mousse".equals(type)){
            return new MousseCake();
        }else {
            System.out.println("没有找到相应的蛋糕");
            return null;
        }
    }
}
