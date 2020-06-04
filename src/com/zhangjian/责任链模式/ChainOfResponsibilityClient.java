package com.zhangjian.责任链模式;

import com.zhangjian.责任链模式.gruop.DepartmentHeader;
import com.zhangjian.责任链模式.gruop.GroupLeader;
import com.zhangjian.责任链模式.gruop.Manager;

import java.util.ArrayList;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class ChainOfResponsibilityClient {

    private ArrayList<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies = new ArrayList<Ratify>();
    }

    /**
     * 方法描述：为了展示“责任链模式”的真正的迷人之处（可扩展性），在这里构造该方法以便添加自定义的“责任人”
     *
     * @param ratify
     */
    public void addRatifys(Ratify ratify) {
        ratifies.add(ratify);
    }

    /**
     * 方法描述：执行请求
     * @param leave
     * @return
     */
    public Result execute(Leave leave) {
        ArrayList<Ratify> arrayList = new ArrayList<Ratify>();
        arrayList.addAll(ratifies);
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());

        RealChain realChain = new RealChain(arrayList,leave,0);

        return realChain.proceed(leave);
    }

}
