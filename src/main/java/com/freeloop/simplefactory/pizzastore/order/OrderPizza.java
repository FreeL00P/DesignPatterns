package com.freeloop.simplefactory.pizzastore.order;

import com.freeloop.simplefactory.pizzastore.pizza.CheesePizza;
import com.freeloop.simplefactory.pizzastore.pizza.GreekPizza;
import com.freeloop.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OrderPizza
 *
 * @author fj
 * @since 2023/4/6 19:26
 */
public class OrderPizza {
/*    public OrderPizza(){
        Pizza pizza=null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza=new CheesePizza();
                pizza.setName("奶酪披萨");
            }else{
                break;
            }
            //输出披萨制作工厂
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);

    }*/


    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";
        this.simpleFactory=simpleFactory;
        do {
            orderType=this.getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                System.out.println("pizza = " + pizza);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败");
                break;
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
