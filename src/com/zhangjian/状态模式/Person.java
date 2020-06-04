package com.zhangjian.状态模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Person {
    private State state;
    public Person(){
        state = new Mad(this);
    }
    public void setState(State state){
        this.state = state;
    }
    public void doSomething(){
        state.doSomething();
        state.changeState();
    }
}
