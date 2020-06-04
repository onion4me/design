package com.zhangjian.工厂方法;

/**
 * @author zhangjian
 * @date 2018/7/19
 */
public class MyFactory {

    public static  String getObject(int index){
        switch (index){
            case 1:
                return "1";
            case 2:
                return "2";
            default:
                return "0";
        }
    }
}
