package com.zhangjian.责任链模式;

import java.util.List;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class RealChain  implements Ratify.Chain{

    public Leave leave;
    public List<Ratify> ratifyList;
    public int index;

    /**
     * 构造方法
     *
     * @param ratifyList
     *            Ratify接口的实现类集合
     * @param leave
     *            具体的请求Request实例
     * @param index
     *            已经处理过该request的责任人数量
     */
    public RealChain(List<Ratify> ratifyList, Leave leave, int index) {
        this.ratifyList = ratifyList;
        this.leave = leave;
        this.index = index;
    }

    /**
     * 方法描述：具体转发功能
     */
    @Override
    public Result proceed(Leave request) {
        Result proceed = null;
        if (ratifyList.size() > index) {
            RealChain realChain = new RealChain(ratifyList, request, index + 1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.deal(realChain);
        }

        return proceed;
    }

    /**
     * 方法描述：返回当前Request对象或者返回当前进行包装后的Request对象
     */
    @Override
    public Leave request() {
        return leave;
    }
}
