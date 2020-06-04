package com.zhangjian.状态模式;

/**状态模式
 *  状态模式属于对象创建型的一种模式，其意图是允许一个对象在其内部状态改变时改变它的行为
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest {
    public static void main(String[] args) {
        Person p = new Person();
        for (int i = 0; i < 10; i++){
            p.doSomething();
        }
    }
}
