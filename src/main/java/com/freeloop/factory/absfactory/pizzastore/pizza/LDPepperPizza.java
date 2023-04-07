package com.freeloop.factory.absfactory.pizzastore.pizza;

/**
 * LDPepperPizza
 *
 * @author fj
 * @since 2023/4/7 19:21
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        this.setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨准备原材料");
    }
}
