package com.freeloop.bridge;

/**
 * FoldPhone
 *
 * @author fj
 * @since 2023/4/9 22:32
 */
public class FoldPhone extends Phone{
    public FoldPhone(Brand brand) {
        super(brand);
    }
    public void open() {
        super.open();
        System.out.println("折叠手机");
    }
    public void close() {
        super.close();
        System.out.println("折叠手机");
    }
    public void call() {
        super.call();
        System.out.println("折叠手机");
    }
}
