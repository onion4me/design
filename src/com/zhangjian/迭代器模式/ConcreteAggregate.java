package com.zhangjian.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public MyIterator iterator() {
        return new ConcreteIterator(list);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
}
