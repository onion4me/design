package com.zhangjian.模板方法;

/**模板方法
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
