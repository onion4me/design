package com.zhangjian.桥接模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class OracleDriver implements Driver {

    @Override
    public void connect() {
        System.out.println("在这里连接oracle数据库");
    }

}
