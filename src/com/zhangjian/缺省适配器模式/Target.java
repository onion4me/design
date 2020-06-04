package com.zhangjian.缺省适配器模式;

/**下面以一个简单例子来说明，假如有个接口，有5个方法，你需要实现这个接口，你每次只对其中一个方法感兴趣，你如何用最简单的方法去构造这个接口的实现类
 * @author zhangjian
 * @date 2018/7/13
 */
public interface Target {
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}
