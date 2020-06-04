package com.zhangjian.桥接模式;

/**
 * 桥梁抽象
 * @author zhangjian
 * @date 2018/7/13
 */
public abstract class Bridge {

    private Driver driver;

    public void connect(){
        driver.connect();
    }

    public void setDriver(Driver driverTemp){
        this.driver = driverTemp;
    }

    public Driver getDriver(){
        return this.driver;
    }
}
