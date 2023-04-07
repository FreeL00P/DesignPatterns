package com.freeloop.factory.absfactory.pizzastore.order;

/**
 * PizzaStore
 *
 * @author fj
 * @since 2023/4/7 20:50
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
