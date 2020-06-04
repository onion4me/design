package com.zhangjian.单例模式;

/**单例模式第二种实现
 *   相比于第一种实现 增加了synchronized的关键字进行修饰，可以回避多线程环境下的问题。
 *    但是时效性上存在一定问题。主要体现在synchronized修饰符的同步准备上。
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_2 {
    private static MyTest_2 instance = null;

    public synchronized static MyTest_2 getInstance() {
        if (instance == null) {
            instance = new MyTest_2();
        }
        return instance;
    }
}
