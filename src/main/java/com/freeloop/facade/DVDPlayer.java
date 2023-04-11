package com.freeloop.facade;

/**
 * DVDPlayer
 * 外观模式
 * @author fj
 * @since 2023/4/11 19:13
 */
public class DVDPlayer {
    //使用单例模式,饿汉式
    private static DVDPlayer instance=new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }
    private DVDPlayer() {}
    public void on(){
        System.out.println("DVD ON");
    }
    public void off(){
        System.out.println("DVD OFF");
    }
    public void play(){
        System.out.println("DVD PLAY");
    }
    public void pause(){
        System.out.println("DVD PAUSE");
    }
}
