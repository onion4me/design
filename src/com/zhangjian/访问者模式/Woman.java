package com.zhangjian.访问者模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public class Woman implements Person {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
