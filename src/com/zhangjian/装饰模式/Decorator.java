package com.zhangjian.装饰模式;

/**装饰角色：持有一个构件(Component)对象的引用
 * @author zhangjian
 * @date 2018/7/13
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
    }
}
