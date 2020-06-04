package com.zhangjian.访问者模式;

/**
 * @author zhangjian
 * @date 2018/7/16
 */
public interface Visitor {
    void visit(Man man);
    void visit(Woman girl);
}
