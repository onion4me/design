package com.zhangjian.建造者模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class House {

    public String color;
    //地基
    private String basic;
    //墙
    private String wall;
    //楼顶
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
