package com.freeloop.decorator;

/**
 * Milk
 *
 * @author fj
 * @since 2023/4/10 11:13
 */
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
