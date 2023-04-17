package com.freeloop.strategy;

/**
 * Duck
 *
 * @author fj
 * @since 2023/4/17 15:15
 */
public abstract class Duck {
    //属性，策略接口
    FlyBehavior flyBehavior;
    //其他属性
    public Duck(){
    }
    public abstract void disPlay();//显示鸭子信息
    public void quack(){
        System.out.println("鸭子叫");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
