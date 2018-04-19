package com.design.structural.pattern.proxy.statick;

/**
 * @author dingdong
 * @date 2018/4/19.
 */
public class TransAccountsProxy implements TransAccounts {
    private TransAccounts transAccounts;
    public TransAccountsProxy(TransAccounts transAccounts) {
        this.transAccounts = transAccounts;
    }

    @Override
    public void transAccount(Long money, Account accountFrom, Account accountTo) {
        System.out.println("开启事务...");
        transAccounts.transAccount(money,accountFrom,accountTo);
        System.out.println("开启事务...");
    }

    @Override
    public void getMoney(Long money, Account account) {
        System.out.println("开启事务...");
        transAccounts.getMoney(money,account);
        System.out.println("开启事务...");
    }
}
