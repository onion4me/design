package com.zhangjian.缺省适配器模式;

/**实际类:通过重写默认适配实现来实现自己感兴趣的部分。
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyInteresting extends DefaultAdapter {

    @Override
    public void m5(){
        System.out.println("我只想用m5，其他方法不想用");
    }

}
