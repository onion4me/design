package com.zhangjian.建造者模式;

/**建造者模式主要意图就是封装
 * 将实现过程进行隐藏
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {

        House house = new Director().createHouse(new CreateBuilder("red"));

        House house1 = new Director().createHouse(new CreateBuilder("blue"));
        // 我想要一個房子
        // 我有設計圖
        // 我有工人
        // 我找到工人 讓他幫助我建造房子
    }
}
