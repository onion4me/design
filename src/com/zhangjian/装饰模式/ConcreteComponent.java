package com.zhangjian.装饰模式;

/**具体构件
 * @author zhangjian
 * @date 2018/7/13
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
