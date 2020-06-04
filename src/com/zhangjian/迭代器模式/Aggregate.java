package com.zhangjian.迭代器模式;


/**
 * @author zhangjian
 * @date 2018/7/13
 */
public interface Aggregate {
     void add(Object obj);
     void remove(Object obj);
     MyIterator iterator();
}
