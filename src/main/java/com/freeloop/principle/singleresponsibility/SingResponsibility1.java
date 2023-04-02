package com.freeloop.principle.singleresponsibility;

/**
 * SingResponsibility
 * 单一职责原则
 * @author fj
 * @since 2023/4/2 21:10
 */
public class SingResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("飞机");
    }
}

//交通工具类

/**
 * 在方式1的run方法中违反单一职责原则
 * 解决的方案，工具交通工具运行的方式不同分解成不同的类
 */
class Vehicle{
    public void run (String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
}