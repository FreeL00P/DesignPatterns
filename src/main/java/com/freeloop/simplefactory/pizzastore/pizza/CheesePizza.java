package com.freeloop.simplefactory.pizzastore.pizza;

/**
 * CheesePizza
 *
 * @author fj
 * @since 2023/4/6 19:23
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨，准备原材料");
    }
}
