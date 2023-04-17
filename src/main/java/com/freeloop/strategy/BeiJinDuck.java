package com.freeloop.strategy;

/**
 * BeiJingDuck
 *
 * @author fj
 * @since 2023/4/17 15:21
 */
public class BeiJinDuck extends Duck {
    public BeiJinDuck() {
        flyBehavior=new NoFlyBehavior();
    }
    @Override
    public void disPlay() {
        System.out.println("北京鸭子");
    }

}
