package com.zhangjian.状态模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Happy implements  State {
    Person p;
    public Happy(Person p){
        this.p = p;
    }

    @Override
    public void doSomething(){
        System.out.println("I'm happy!");
    }

    @Override
    public void changeState(){
        p.setState(new Mad(p));
    }
}
