package com.zhangjian.抽象工厂;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
           AbstractFactoryConcrete abstractFactoryConcrete = new AbstractFactory();
           abstractFactoryConcrete.getProduct().myInfos();
    }
}
