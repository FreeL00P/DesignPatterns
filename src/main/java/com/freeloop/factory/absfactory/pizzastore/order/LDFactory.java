package com.freeloop.factory.absfactory.pizzastore.order;

import com.freeloop.factory.absfactory.pizzastore.pizza.*;

/**
 * LDFactory
 *
 * @author fj
 * @since 2023/4/7 20:40
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("制作伦敦披萨");
        Pizza pizza=null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
