package com.freeloop.strategy;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/17 15:25
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.disPlay();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.disPlay();
        toyDuck.fly();
        //动态改变某个对象的行为
        BeiJinDuck beiJinDuck = new BeiJinDuck();
        beiJinDuck.disPlay();
        beiJinDuck.fly();
        System.out.println("改变北京鸭的状态");
        beiJinDuck.setFlyBehavior(new GoodFlyBehavior());
        beiJinDuck.fly();
    }
}
