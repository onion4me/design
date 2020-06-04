package com.zhangjian.装饰模式;

/**装饰模式 也称 包装模式
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator2(new ConcreteDecorator1(
                new ConcreteComponent()));

        component.doSomething();
    }
}
