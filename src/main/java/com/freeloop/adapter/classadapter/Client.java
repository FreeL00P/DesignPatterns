package com.freeloop.adapter.classadapter;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/9 13:26
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
