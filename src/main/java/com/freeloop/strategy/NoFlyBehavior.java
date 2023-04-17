package com.freeloop.strategy;

/**
 * NoFlyBehavior
 *
 * @author fj
 * @since 2023/4/17 15:13
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不善于飞翔的鸭子");
    }
}
