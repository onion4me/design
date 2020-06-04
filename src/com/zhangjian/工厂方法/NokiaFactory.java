package com.zhangjian.工厂方法;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class NokiaFactory  implements MobileFactory {

    @Override
    public Mobile produceMobile() {
        return new Nokia();
    }
}
