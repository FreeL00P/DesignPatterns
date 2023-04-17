package com.freeloop.strategy;

/**
 * BadFlyBehavior
 *
 * @author fj
 * @since 2023/4/17 15:13
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不善于飞翔的鸭子");
    }
}
