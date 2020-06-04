package com.zhangjian.责任链模式.gruop;

import com.zhangjian.责任链模式.Builder;
import com.zhangjian.责任链模式.Leave;
import com.zhangjian.责任链模式.Ratify;
import com.zhangjian.责任链模式.Result;

/**组长
 * @author zhangjian
 * @date 2018/7/13
 */
public class GroupLeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        Leave leave = chain.request();
        System.out.println("GroupLeader=====>Leave:" + leave.toString());

        if (leave.getDays() > 1) {
            Builder builder = new Builder().newRequest(leave);

            builder.setManagerInfo(leave.getName()+ "平时表现不错，而且现在项目也不忙");

            Leave newLeave =  builder.build();

            return chain.proceed(newLeave);
        }

        return new Result(true, "GroupLeader：早去早回");
    }

}
