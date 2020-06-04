package com.zhangjian.责任链模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class MyTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("张三");
        builder.setDays(5);
        builder.setReason("事假");
        Leave request = builder.build();

        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();

        Result result = client.execute(request);

        System.out.println("结果：" + result.toString());
    }
}
