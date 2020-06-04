package com.zhangjian.状态模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Angry implements  State{
    Person p;

    public Angry(Person p) {
        this.p = p;
    }

    @Override
    public void doSomething() {
        System.out.println("I'm angry!");
    }

    @Override
    public void changeState() {
        p.setState(new Happy(p));
    }
}
