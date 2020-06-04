package com.zhangjian.策略模式;

/**高级会员折扣类
 * @author zhangjian
 * @date 2018/7/16
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
