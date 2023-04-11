package com.freeloop.facade;

/**
 * Screen
 *
 * @author fj
 * @since 2023/4/11 19:24
 */
public class Screen {
    private static Screen instance=new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return instance;
    }
    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }

}
