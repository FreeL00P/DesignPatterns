package com.freeloop.factory.factorymethod.pizzastore.order;

import java.util.Scanner;

/**
 * PizzaStore
 *
 * @author fj
 * @since 2023/4/7 19:40
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种pizza
        String location =new Scanner(System.in).next();
        if (location.equals("bj")) {
            new BJOrderPizza();
        }else if (location.equals("ld")){
            new LDOrderPizza();
        }

    }
}
