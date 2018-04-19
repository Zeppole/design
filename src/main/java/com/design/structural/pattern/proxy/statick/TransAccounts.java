package com.design.structural.pattern.proxy.statick;

/**
 * @author dingdong
 * @date 2018/4/19.
 */
public interface TransAccounts {

    void transAccount(Long money,Account accountFrom,Account accountTo);

    void getMoney(Long money,Account account);
}
