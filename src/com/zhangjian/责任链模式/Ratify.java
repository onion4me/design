package com.zhangjian.责任链模式;

/**请假过程抽象
 * @author zhangjian
 * @date 2018/7/13
 */
public interface Ratify {
    // 处理请求
     Result deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Leave request();

        // 转发request
        Result proceed(Leave request);
    }
}
