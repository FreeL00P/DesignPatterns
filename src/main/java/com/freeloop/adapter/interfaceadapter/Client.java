package com.freeloop.adapter.interfaceadapter;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/9 14:40
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter= new AbsAdapter() {
            //只需要去覆盖我们需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
