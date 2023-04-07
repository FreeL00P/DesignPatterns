package com.freeloop.factory.factorymethod.pizzastore.order;

import com.freeloop.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.freeloop.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.freeloop.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * BJOrderPizza
 *
 * @author fj
 * @since 2023/4/7 19:34
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("制作北京披萨");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
