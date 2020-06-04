package com.zhangjian.访问者模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Love implements Visitor{
    public void visit(Man man) {
        System.out.println("当男人恋爱时，凡事不懂也装懂");
    }
    public void visit(Woman girl) {
        System.out.println("当女人恋爱时，遇事懂也装不懂");
    }
}
