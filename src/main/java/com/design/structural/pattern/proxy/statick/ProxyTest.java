package com.design.structural.pattern.proxy.statick;

/**
 * @author dingdong
 * @date 2018/4/19.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Account accountA = new Account("1","tom",10000L);
        Account accountB = new Account("2","jerry",10000L);
        TransAccounts transAccounts = new TransAccountsImpl();
        transAccounts.getMoney(100L,accountA);

        TransAccounts proxy = new TransAccountsProxy(transAccounts);
        proxy.transAccount(100L,accountA,accountB);
    }
}
