package com.zhangjian.模板方法;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class MoneyMarketAccount extends Account{

    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }

}
