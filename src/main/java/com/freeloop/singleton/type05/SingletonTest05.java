package com.freeloop.singleton.type05;

/**
 * SingletonTest05
 *
 * @author fj
 * @since 2023/4/6 17:25
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}
enum Singleton {
    INSTANCE;
    public void sayOk(){
        System.out.println("ok!");
    }
}