package com.freeloop.factory.absfactory.pizzastore.order;

import com.freeloop.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * AbsFactory
 *
 * @author fj
 * @since 2023/4/7 20:36
 */
//一个抽象工厂模式的抽象层
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    Pizza createPizza(String orderType);
}
