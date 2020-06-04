package com.zhangjian.原始模型;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {

    private static PandaToClone thisPanda, thatPanda;

    public static void main(String[] args) {
        thisPanda = new PandaToClone(15,25);
        thisPanda.setAge(13);
        thatPanda = (PandaToClone)thisPanda.clone();
        System.out.println("Age of this panda:"+thisPanda.getAge());
        System.out.println("  height:"+thisPanda.getHeight());
        System.out.println("  weight:"+thisPanda.getWeight());
        System.out.println("Age of this panda:"+thatPanda.getAge());
        System.out.println("  height:"+thatPanda.getHeight());
        System.out.println("  weight:"+thatPanda.getWeight());
    }
}
