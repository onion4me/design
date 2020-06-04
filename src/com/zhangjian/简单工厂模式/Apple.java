package com.zhangjian.简单工厂模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class Apple implements Fruit {
    private int treeAge;

    @Override
    public void grow() {
        log(" Apple is growing ");
    }
    @Override
    public void harvest() {
        log(" Apple has been harvested ");
    }
    @Override
    public void plant() {
        log(" Apple ha been planted ");
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
