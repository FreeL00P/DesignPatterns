package com.freeloop.factory.factorymethod.pizzastore.pizza;

/**
 * LDCheesePizza
 *
 * @author fj
 * @since 2023/4/7 19:23
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        this.setName("伦敦奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
