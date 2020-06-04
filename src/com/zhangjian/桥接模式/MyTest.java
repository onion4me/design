package com.zhangjian.桥接模式;

/**
 * 桥接模式的最主要作用就是将抽象和它对应的实现部分进行分离，降低耦合程度
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取桥梁对象
        Bridge  bridge = new BridgeImpl();
        //获取驱动对象，并建立连接
        Driver mysqlDriver = new MysqlDriver();
        bridge.setDriver(mysqlDriver);
        mysqlDriver.connect();
    }
}
