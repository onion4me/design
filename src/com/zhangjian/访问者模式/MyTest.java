package com.zhangjian.访问者模式;

/**访问者模式
 *  访问者模式仅应当用于数据结构非常稳定的情况下使用，
 *  它把数据结构和作用于数据结构上的操作之间的耦合脱开，
 *  使得操作集合可以相对自由地演化。
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure(); // 依赖于ObjectStructure

        o.attach(new Man()); // 实例化具体元素
        o.attach(new Woman()); // 实例化具体元素

        // 当成功时不同元素的不同反映
        Visitor success = new Success(); // 依赖于抽象的Visitor接口
        o.display(success);

        // 当恋爱时的不同反映
        Visitor amativeness = new Love(); // 依赖于抽象的Visitor接口
        o.display(amativeness);

    }
}
