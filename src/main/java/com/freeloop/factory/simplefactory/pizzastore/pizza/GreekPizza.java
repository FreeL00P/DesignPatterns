package com.freeloop.factory.simplefactory.pizzastore.pizza;

/**
 * GreekPizza
 *
 * @author fj
 * @since 2023/4/6 19:24
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨,准备原材料");
    }
}
