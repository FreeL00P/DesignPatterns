package com.freeloop.strategy;

/**
 * GoodFlyBehavior
 *
 * @author fj
 * @since 2023/4/17 15:12
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("擅长飞行的鸭子");
    }
}
