package com.zhangjian.调停者模式;

/**同事类显卡
 * @author zhangjian
 * @date 2018/7/13
 */
public class VideoCard   extends Colleague {
    /**
     * 构造函数
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 显示视频数据
     */
    public void showData(String data){
        System.out.println("您正在观看的是：" + data);
    }
}
