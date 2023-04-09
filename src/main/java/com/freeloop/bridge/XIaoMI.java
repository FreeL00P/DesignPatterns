package com.freeloop.bridge;

/**
 * XIaoMI
 *
 * @author fj
 * @since 2023/4/9 22:26
 */
public class XIaoMI implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
