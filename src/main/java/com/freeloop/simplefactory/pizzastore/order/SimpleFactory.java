package com.freeloop.simplefactory.pizzastore.order;

import com.freeloop.simplefactory.pizzastore.pizza.CheesePizza;
import com.freeloop.simplefactory.pizzastore.pizza.GreekPizza;
import com.freeloop.simplefactory.pizzastore.pizza.Pizza;

/**
 * SimpleFactory
 * 简单工厂
 * @author fj
 * @since 2023/4/6 19:53
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza=new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
