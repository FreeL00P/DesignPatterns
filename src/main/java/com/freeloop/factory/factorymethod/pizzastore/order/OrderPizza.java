package com.freeloop.factory.factorymethod.pizzastore.order;

import com.freeloop.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OrderPizza
 *
 * @author fj
 * @since 2023/4/6 19:26
 */
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza,让各个子类自己实现
    abstract Pizza createPizza(String orderType);
    public OrderPizza(){
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            Pizza pizza = createPizza(orderType);
            //输出披萨制作工厂
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);

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
