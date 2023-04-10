package com.freeloop.decorator;

/**
 * Decorator
 *
 * @author fj
 * @since 2023/4/10 11:04
 */
public class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink obj) {
        this.obj = obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+ obj.cost();
    }



    @Override
    public String getDes() {
        return super.des
                +" "+super.getPrice()
                +"&&"+obj.getDes();
    }
}
