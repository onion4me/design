package com.zhangjian.简单工厂模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class FruitGardener {
    public static Fruit factory(String which) throws Exception {
        if (which.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (which.equalsIgnoreCase("grape")) {
            return new Grape();
        } else {
            throw new Exception("Bad fruit request");
        }
    }
}
