package com.zhangjian.模板方法;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class CDAccount extends Account{

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
