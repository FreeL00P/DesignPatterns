package com.freeloop.builder.improve;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/8 22:00
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        //完成盖房子
        House house = houseDirector.constructHouse();
        System.out.println("house = " + house);
    }
}
