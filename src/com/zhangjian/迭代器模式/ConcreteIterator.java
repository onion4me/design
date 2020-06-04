package com.zhangjian.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class ConcreteIterator implements MyIterator {
    private List list = new ArrayList();
    private int cursor =0;
    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(cursor==list.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
