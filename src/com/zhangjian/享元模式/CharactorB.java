package com.zhangjian.享元模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class CharactorB extends Charactor {
    /**
     * 构造函数
     */
    public CharactorB() {
        this.letter = 'B';
    }

    /**
     * 显示方法
     */
    @Override
    public void display() {
        try {
            System.out.println(this.letter);
        } catch (Exception err) {
        }
    }
}
