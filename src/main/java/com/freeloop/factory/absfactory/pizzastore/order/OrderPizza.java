package com.freeloop.factory.absfactory.pizzastore.order;

import com.freeloop.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * OrderPizza
 *
 * @author fj
 * @since 2023/4/7 20:42
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza=null;
        String orderType ="";
        this.absFactory=absFactory;
        do {
            orderType=this.getType();
            pizza=absFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }
    public String getType(){
        try{
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("披萨种类:");
            return strIn.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
