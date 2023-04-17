package com.freeloop.strategy;

/**
 * ToyDuck
 *
 * @author fj
 * @since 2023/4/17 15:23
 */
public class ToyDuck extends Duck{
    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }

    @Override
    public void disPlay() {
        System.out.println("玩具鸭");
    }

}
