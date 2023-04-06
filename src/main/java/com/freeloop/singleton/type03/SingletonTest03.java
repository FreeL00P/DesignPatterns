package com.freeloop.singleton.type03;

import java.util.IllegalFormatCodePointException;

/**
 * SingletonTest03
 *
 * @author fj
 * @since 2023/4/6 16:45
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode()+"<==>"+instance1.hashCode());
        System.out.println(instance==instance1);
    }
}
//class Singleton{
//    private static Singleton instance;
//    private Singleton(){}
//    //提供一个公有方法，当使用到该方法时，才去创建instance
//    // 即懒汉式
//    public static Singleton getInstance(){
//        if(instance==null){
//            //线程不安全
//            //实际开发中不要使用
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

/**
 * 使用 synchronized 可能会带来性能问题。因为每一次调用 getInstance()
 * 方法时都需要获取锁来确保线程安全，
 * 可能会导致程序的运行效率下降。为了避免这些问题，
 * 可以使用双重检测锁的方式来进行优化，即使用一个局部变量来存储实例，
 * 并在后面使用双重判断语句和 synchronized 关键字来确保线程安全。
 */
class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}