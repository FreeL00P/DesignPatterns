package com.freeloop.facade;

/**
 * Stereo
 *
 * @author fj
 * @since 2023/4/11 19:25
 */
public class Stereo {
    private static Stereo instance=new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return instance;
    }
    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void up(){
        System.out.println("Stereo up");
    }
}
