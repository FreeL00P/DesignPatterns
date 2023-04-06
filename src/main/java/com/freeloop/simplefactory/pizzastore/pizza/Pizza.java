package com.freeloop.simplefactory.pizzastore.pizza;

/**
 * Pizza
 *
 * @author fj
 * @since 2023/4/6 19:18
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name + "==>bake");
    }
    public void cut(){
        System.out.println(name + "==>cut");
    }
    public void box(){
        System.out.println(name + "==>box");

    }
    public void setName(String name) {
        this.name = name;
    }
}
