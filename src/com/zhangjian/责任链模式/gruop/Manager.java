package com.zhangjian.责任链模式.gruop;

import com.zhangjian.责任链模式.Builder;
import com.zhangjian.责任链模式.Leave;
import com.zhangjian.责任链模式.Ratify;
import com.zhangjian.责任链模式.Result;

/**经理
 * @author zhangjian
 * @date 2018/7/13
 */
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Leave leave = chain.request();
        System.out.println("GroupLeader=====>Leave:" + leave.toString());

        if (leave.getDays() > 1) {
            Builder builder = new Builder().newRequest(leave);

            builder.setManagerInfo(leave.getName()+  "每月的KPI考核还不错，可以批准");

            Leave newLeave =  builder.build();

            return chain.proceed(newLeave);
        }

        return new Result(true, "Manager：早去早回");
    }
}
