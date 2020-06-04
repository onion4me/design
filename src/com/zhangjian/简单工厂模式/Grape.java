package com.zhangjian.简单工厂模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class Grape implements Fruit {
    private boolean seedless;

    @Override
    public void grow() {
    }
    @Override
    public void harvest() {
    }
    @Override
    public void plant() {
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

}
