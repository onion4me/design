package com.zhangjian.单例模式;

/**单例模式第六种实现
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于SingletonHolder是私有的，除了getInstance()之外没有办法访问它，
 * 因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖JDK版本。
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_6 {

    private static class SingletonHolder {
        /**
         * 单例对象实例
         */
        static final MyTest_6 INSTANCE = new MyTest_6();
    }

    public static MyTest_6 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
