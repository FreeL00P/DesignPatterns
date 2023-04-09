package com.freeloop.bridge;

/**
 * Vivo
 *
 * @author fj
 * @since 2023/4/9 22:27
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
