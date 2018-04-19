package com.design.structural.pattern.proxy.statick;

/**
 * @author dingdong
 * @date 2018/4/19.
 */
public class Account {
    private String id;
    private String name;
    private Long money;

    public Account(String id, String name, Long money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
