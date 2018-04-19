package com.design.structural.pattern.proxy.statick;

/**
 * @author dingdong
 * @date 2018/4/19.
 */
public class TransAccountsImpl implements TransAccounts {
    @Override
    public void transAccount(Long money, Account accountFrom, Account accountTo) {
        System.out.println(accountFrom.getName()+"转账" +money+ "元到" +accountTo.getName()+ "账户");
    }

    @Override
    public void getMoney(Long money, Account account) {
        System.out.println(account.getName()+"取钱"+ money +"元");
    }
}
