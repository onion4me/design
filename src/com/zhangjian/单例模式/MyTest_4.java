package com.zhangjian.单例模式;

/**单例模式第四种实现
 * 看起来这样已经达到了我们的要求，除了第一次创建对象之外，其他的访问在第一个if中就返回了，因此不会走到同步块中。已经完美了吗？
 *
 * 我们来看看这个场景：假设线程一执行到instance = new
 * SingletonKerriganD()这句，这里看起来是一句话，但实际上它并不是一个原子操作
 * （原子操作的意思就是这条语句要么就被执行完，要么就没有被执行过
 * ，不能出现执行了一半这种情形）。事实上高级语言里面非原子操作有很多，我们只要看看这句话被编译后在JVM执行的对应汇编代码就发现
 * ，这句话被编译成8条汇编指令，大致做了3件事情：
 *
 * 1.给Kerrigan的实例分配内存。 2.初始化Kerrigan的构造器
 * 3.将instance对象指向分配的内存空间（注意到这步instance就非null了）。
 *
 * @author zhangjian
 * @date 2018/7/16
 */
public class MyTest_4 {

    /**
     * 单例对象实例
     */
    private static MyTest_4 instance = null;
    public static MyTest_4 getInstance() {
        if (instance == null) {
            synchronized (MyTest_4.class) {
                if (instance == null) {
                    instance = new MyTest_4();
                }
            }
        }
        return instance;
    }
}
