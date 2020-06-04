package com.zhangjian.工厂方法;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {

        MobileFactory mbf = new NokiaFactory();
        Mobile mb = mbf.produceMobile();
        mb.call();


        mbf= new MotorolaFactory();
        mb=mbf.produceMobile();
        mb.call();
    }
}
