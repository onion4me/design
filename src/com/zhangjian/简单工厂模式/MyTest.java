package com.zhangjian.简单工厂模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) throws Exception{
        Fruit ap = FruitGardener.factory("Apple");
        ap.grow();
        Fruit gp = FruitGardener.factory("Grape");
        gp.plant();
        //抛出Bad fruit request异常
        Fruit dd = FruitGardener.factory("ddd");
    }
}
