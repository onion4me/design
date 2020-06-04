package com.zhangjian.建造者模式;

/**我是建造者
 * @author zhangjian
 * @date 2018/7/13
 */
public class Director {

    public  House createHouse(CreateBuilder createBuilder){
        createBuilder.buildBasic();
        createBuilder.buildWalls();
        createBuilder.buildWalls();
        return  createBuilder.buildHose();
    }

}
