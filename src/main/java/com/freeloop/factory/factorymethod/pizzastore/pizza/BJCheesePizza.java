package com.freeloop.factory.factorymethod.pizzastore.pizza;

/**
 * BJChesePizza
 *
 * @author fj
 * @since 2023/4/7 19:16
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        this.setName("北京奶酪披萨");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
