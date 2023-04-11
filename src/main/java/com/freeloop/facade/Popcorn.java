package com.freeloop.facade;

/**
 * Popcorn
 *
 * @author fj
 * @since 2023/4/11 19:19
 */
public class Popcorn {
    private static Popcorn instance=new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void pop(){
        System.out.println("Popcorn pop");
    }
}
