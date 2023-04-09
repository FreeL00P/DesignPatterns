package com.freeloop.bridge;

/**
 * UpRightPhone
 *
 * @author fj
 * @since 2023/4/9 22:47
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }


    public void open() {
        super.open();
        System.out.println("直立手机");
    }
    public void close() {
        super.close();
        System.out.println("直立手机");
    }
    public void call() {
        super.call();
        System.out.println("直立手机");
    }
}
