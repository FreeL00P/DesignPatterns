package com.freeloop.decorator;

/**
 * Coffee
 *
 * @author fj
 * @since 2023/4/10 10:58
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }

}
