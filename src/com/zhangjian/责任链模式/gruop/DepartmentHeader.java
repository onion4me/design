package com.zhangjian.责任链模式.gruop;

import com.zhangjian.责任链模式.Leave;
import com.zhangjian.责任链模式.Ratify;
import com.zhangjian.责任链模式.Result;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class DepartmentHeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Leave request = chain.request();
        System.out.println("DepartmentHeader=====>request:"
                + request.toString());
        if (request.getDays() > 7) {
            return new Result(false, "你这个完全没必要");
        }
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }
}
