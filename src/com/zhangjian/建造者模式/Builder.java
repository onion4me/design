package com.zhangjian.建造者模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public interface  Builder {

    /**
     * 建造地基
     */
    void buildBasic();

    /**
     * 砌墙
     */
    void buildWalls();

    /**
     * 房子封顶
     */
    void roofed();

    House buildHose();
}
