package com.freeloop.builder.improve;

/**
 * HouseBuilder
 *
 * @author fj
 * @since 2023/4/8 21:46
 */
//抽象的建造者
public abstract class HouseBuilder {
    protected House house=new House();
    //将建造的流程写好，抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //建造房子
    public House buildHouse(){
        return house;
    }
}
