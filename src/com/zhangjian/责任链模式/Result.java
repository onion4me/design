package com.zhangjian.责任链模式;

/**消息模型
 * @author zhangjian
 * @date 2018/7/13
 */
public class Result {
    public boolean isRatify;
    public String info;

    public Result() {
    }
    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }
    @Override
    public String toString() {
        return "Result [isRatify=" + isRatify + ", info=" + info + "]";
    }

}
