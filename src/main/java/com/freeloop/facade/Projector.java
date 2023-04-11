package com.freeloop.facade;

/**
 * Projector
 *
 * @author fj
 * @since 2023/4/11 19:22
 */
public class Projector {
    private static Projector instance=new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void focus(){
        System.out.println("Projector focus");
    }
}
