package com.freeloop.factory.absfactory.pizzastore.order;

import com.freeloop.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.freeloop.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.freeloop.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * BJFactory
 *
 * @author fj
 * @since 2023/4/7 20:38
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("制作北京披萨");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
