package com.freeloop.principle.singleresponsibility;

/**
 * SingResponsibility2
 * 单一职责原则
 * @author fj
 * @since 2023/4/2 21:15
 */
public class SingResponsibility2 {
    public static void main(String[] args) {
        new RoadVehicle().run("汽车");
        new AirVehicle().run("飞机");
        new WaterVehicle().run("船");
    }
}

/**
 * 方案2
 * 遵守单一职责原则
 * 改的很大，即将类分解，同时修改客户端
 */
//路上交通
class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行......");
    }
}

//路上交通
class AirVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"天空运行......");
    }
}

//路上交通
class WaterVehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"水中运行......");
    }
}