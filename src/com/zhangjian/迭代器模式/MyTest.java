package com.zhangjian.迭代器模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        MyIterator it =  ag.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
