package com.zhangjian.单例模式;

/**单例模式第一种实现
 *漏洞：多线程情况下
 *      第一条线程 验证13行直接进入14行 但是没有执行实例
 *      第二条线程被CPU唤起 由于instance没有实例，所以会执行实例操作
 *       CPU将第一条线程唤起，执行例操作
 *       最终产生两个instance对象~~~~ 问题在于此。
 *
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_1 {

    private static MyTest_1 instance = null;

    public static MyTest_1 getInstance() {
        if (instance == null) {
            instance = new MyTest_1();
        }
        return instance;
    }

}
