package com.zhangjian.策略模式;

/**初级会员折扣类
 * @author zhangjian
 * @date 2018/7/16
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
