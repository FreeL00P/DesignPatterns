package com.freeloop.principle.singleresponsibility;

/**
 * SingResponsibility3
 *
 * @author fj
 * @since 2023/4/2 21:20
 */
public class SingResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("汽车");
        vehicle2.runRoad("船");
    }
}
class Vehicle2{
    public void runRoad (String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
    public void runAir (String vehicle){
        System.out.println(vehicle+"在天上运行......");
    }
    public void runWater (String vehicle){
        System.out.println(vehicle+"在水上运行......");
    }
}