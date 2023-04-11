package com.freeloop.facade;

/**
 * TheaterLight
 *
 * @author fj
 * @since 2023/4/11 19:28
 */
public class TheaterLight {
    private static TheaterLight instance=new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("TheaterLight on");
    }
    public void off(){
        System.out.println("TheaterLight off");
    }
    public void bright(){
        System.out.println("TheaterLight bright");
    }
    public void dim(){
        System.out.println("TheaterLight dim");
    }
}
