package com.zhangjian.享元模式;

/**
 * 享元模式根本思想就是相同部分共享，
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        Charactor a = new CharactorA();
        Charactor b = new CharactorB();

        // 显示字符A
        display(a, 12);
        // 显示字符B
        display(b, 14);
    }
    // 设置字符的大小
    public static void display(Charactor objChar, int nSize) {
        try {
            System.out.println("字符：" + objChar.letter + "，大小：" + nSize);
        } catch (Exception err) {
        }
    }
}
