package com.zhangjian.单例模式;

/**单例模式第五种实现
 * 根据JLS（Java Language Specification）中的规定，一个类在一个ClassLoader中只会被初始化一次，
 * 这点是JVM本身保证的，那就把初始化实例的事情扔给JVM好了，代码被改成这样：也就是标准的饿汉式写法
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_5 {

    private static MyTest_5 instance = new MyTest_5();
    public static MyTest_5 getInstance() {
        return instance;
    }
}
