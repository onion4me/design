package com.zhangjian.观察者模式;

/**具体观察者角色(Watcher)
 * @author zhangjian
 * @date 2018/7/13
 */
public class ConcreteWatcher implements AbstractWatcher {

    /**
     * 观察到被观察者发生变化时，执行的方法
     */
    @Override
    public void update() {
        System.out.println("update.....");

    }

}