package com.design.creation.pattern.singleton;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    /**私有化构造*/
    private Singleton(){}
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            //双重检查加锁
            synchronized (Singleton.class) {
                if(uniqueInstance==null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
