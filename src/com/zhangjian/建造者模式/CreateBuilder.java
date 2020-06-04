package com.zhangjian.建造者模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class CreateBuilder implements Builder{

    public CreateBuilder(String color){
        house.setBasic(color);
    }
    @Override
    public void buildBasic() {
        house.setBasic("打基础,啦啦啦");
    }

    @Override
    public void buildWalls() {
        house.setBasic("砌墙,啦啦啦");
    }

    @Override
    public void roofed() {
        house.setBasic("封顶,啦啦啦");
    }

    private House house;

    @Override
    public House buildHose() {
        return house;
    }

}
