package com.zhangjian.多例模式;

import java.util.Random;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class Dice {

    public static final int INSTANCE1 = 0;
    public static final int INSTANCE2 = 1;

    /**
     *  饿汉式
     */
    private static final Dice DICE_INSTANCE1 = new Dice();
    private static final Dice DICE_INSTANCE2 = new Dice();

    /**
     *  私有化构造子,阻止外部直接实例化对象
     */
    private Dice() {

    }

    /**
     * 获取多例类的实例
     * @param which
     *             取值范围：
     *            ① Dice.INSTANCE1：返回Dice的第一个实例对象
     *            ② Dice.INSTANCE2：返回Dice的第二个实例对象
     * @return 返回Dice的一个实例对象
     */
    public static Dice getInstance(int which) {

        switch (which) {
            case INSTANCE1:
                return DICE_INSTANCE1;
            case INSTANCE2:
                return DICE_INSTANCE2;
            default:
                try {
                    throw new Exception("找不到与参数 " + which + " 相匹配的实例！");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return null;
    }

    /**
     * 此方法是线程安全的，调用该方法来掷骰子
     * @return 返回骰子的点数
     */
    public synchronized int roll() {

        try {
            Random ran = new Random(System.currentTimeMillis());
            int rollValue = ran.nextInt();
            rollValue %= 6;
            Thread.sleep(6);
            return rollValue > 0 ? ++rollValue : --rollValue * -1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }
}
