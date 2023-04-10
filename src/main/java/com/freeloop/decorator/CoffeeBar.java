package com.freeloop.decorator;

/**
 * CoffeeBar
 *
 * @author fj
 * @since 2023/4/10 11:16
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //1.点一份longBlack
        Drink order = new LongBlack();
        System.out.println("order = " +order.getDes()+ order.cost());
        //2.加入一份牛奶
        order=new Milk(order);
        System.out.println("order = "+order.getDes() + order.cost());
        //3.加入一份巧克力
        order=new Chocolate(order);
        System.out.println("order = " +order.getDes()+ order.cost());
    }
}
