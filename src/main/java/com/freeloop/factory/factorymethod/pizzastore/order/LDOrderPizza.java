package com.freeloop.factory.factorymethod.pizzastore.order;

import com.freeloop.factory.factorymethod.pizzastore.pizza.*;

/**
 * LDOrderPizza
 *
 * @author fj
 * @since 2023/4/7 19:38
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("制作伦敦披萨");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
