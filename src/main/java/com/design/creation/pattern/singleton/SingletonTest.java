package com.design.creation.pattern.singleton;

/**
 * @author dingdong
 * @date 2018/4/10.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        System.out.println(singleton01==singleton02);
    }
}
