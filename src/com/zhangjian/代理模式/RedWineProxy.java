package com.zhangjian.代理模式;

/**代理主题角色,这里指红酒代理商.它除了也要实现了sellInterface接口外,还持有红酒
 *厂商RedWineFactory 对象的引用,从而使它能在调用真实主题前后做一些必要处理.
 * @author zhangjian
 * @date 2018/7/13
 */
public class RedWineProxy  implements SellInterface{
    @Override
    public Object sell(){
        System.out.println("真实主题角色RedWineFactory 被调用了");
        return new Object();
    }
}


