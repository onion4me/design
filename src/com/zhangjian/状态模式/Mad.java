package com.zhangjian.状态模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Mad implements State {
    Person p;
    public Mad(Person p){
        this.p=p;
    }
    @Override
    public void doSomething(){
        System.out.println("I'm Mad");
    }
    @Override
    public void changeState(){
        p.setState( new Angry(p));
    }
}
