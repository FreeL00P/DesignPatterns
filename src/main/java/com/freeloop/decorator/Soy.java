package com.freeloop.decorator;

/**
 * Soy
 *
 * @author fj
 * @since 2023/4/10 11:14
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
