package com.zhangjian.适配器模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class USB2M3Adapter implements M3Port{

    private USBPort usbPort;

    public USB2M3Adapter(USBPort usbPort){
        this.usbPort = usbPort;
    }

    @Override
    public void m3work() {
        System.out.println("开始在这里进行适配,将USB接口转换成为了M3接口");
        usbPort.workUsb();
        System.out.println("我是M3，我已经开始工作了~");
    }
}
