package com.freeloop.strategy;

/**
 * WildDuck
 *
 * @author fj
 * @since 2023/4/17 15:19
 */
public class WildDuck extends Duck{
    //构造器传入FlyBehavior
    public WildDuck() {
        flyBehavior=new GoodFlyBehavior();
    }
    @Override
    public void disPlay() {
        System.out.println("野鸭子");
    }
}
