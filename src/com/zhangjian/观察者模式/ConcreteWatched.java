package com.zhangjian.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**具体主题角色
 * @author zhangjian
 * @date 2018/7/13
 */
public class ConcreteWatched implements AbstractWatched {
    /**
     * list:存放观察者的一个集合对象
     */
    List<AbstractWatcher> list = new ArrayList<>();

    /**
     * 增加一个观察者
     */
    @Override
    public void addAbstactWatcher(AbstractWatcher watcher) {
        list.add(watcher);

    }

    /**
     * 移除一个观察者
     */
    @Override
    public void removeAbstactWatcher(AbstractWatcher watcher) {
        list.remove(watcher);

    }

    /**
     * 移除所有的观察着
     */
    @Override
    public void removeAll() {
        list.clear();

    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyWatchers() {
        for(AbstractWatcher watcher : list){
            watcher.update();
        }

    }
}
