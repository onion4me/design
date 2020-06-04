package com.zhangjian.访问者模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public interface Person {
    void accept(Visitor visitor);
}
