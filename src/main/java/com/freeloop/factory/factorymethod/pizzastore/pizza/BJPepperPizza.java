package com.freeloop.factory.factorymethod.pizzastore.pizza;

/**
 * BJPepperPizza
 *
 * @author fj
 * @since 2023/4/7 19:20
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        this.setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨准备原材料");
    }
}
