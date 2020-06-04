package com.zhangjian.多例模式;

/** 多例模式，实为单例模式的推广
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {

    private static Dice dice1 = Dice.getInstance(Dice.INSTANCE1), dice2 = Dice
            .getInstance(Dice.INSTANCE2);

    public static void main(String[] args) {
        int value1 = dice1.roll();
        int value2 = dice2.roll();
        System.out.println(value1);
        System.out.println(value2);
    }
}
