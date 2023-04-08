package com.freeloop.builder.improve;

/**
 * HouseDirector
 *
 * @author fj
 * @since 2023/4/8 21:55
 */
public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //指挥
    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
