package com.zhangjian.适配器模式;

/**
 * USB 和 M3 是两种不同规格的电脑上的插座
 * 适配器模式就是将USB接口适配成M3的接口，方便使用
 * 同理 M3也可以适配成USB的接口进行使用
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        USBPort usbPort = new USBPort() {
            @Override
            public void workUsb() {
                System.out.println("我是USB，我在工作");
            }
        };
        M3Port m3Port = new USB2M3Adapter(usbPort);
        m3Port.m3work();
    }
}
