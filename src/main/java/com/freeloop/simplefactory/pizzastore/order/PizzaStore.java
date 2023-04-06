package com.freeloop.simplefactory.pizzastore.order;

/**
 * PizzaStore
 *
 * @author fj
 * @since 2023/4/6 19:35
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
