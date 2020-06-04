package com.zhangjian.单例模式;

/**单例模式第三种实现
 * 同第二种单例模式的实现，关键字移动到内部，本质上和第二种没有什么区别。
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_3 {

    private static MyTest_3 instance = null;
    public static MyTest_3 getInstance() {
        synchronized (MyTest_3.class) {
            if (instance == null) {
                instance = new MyTest_3();
            }
        }
        return instance;
    }
}
