package com.zhangjian.观察者模式;

/** 抽象主题角色类
 * @author zhangjian
 * @date 2018/7/13
 */
public interface AbstractWatched {
    /**
     * 增加一个观察者
     * @param watcher
     */
    void addAbstactWatcher(AbstractWatcher watcher);

    /**
     * 移除一个观察者
     * @param watcher
     */
    void removeAbstactWatcher(AbstractWatcher watcher);

    /**
     * 移除所有的观察着
     */
    void removeAll();

    /**
     * 通知所有的观察者
     */
    void notifyWatchers();

}
