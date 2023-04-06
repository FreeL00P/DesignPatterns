package com.freeloop.singleton.type04;

/**
 * SingletonTest04
 *
 * @author fj
 * @since 2023/4/6 17:11
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("instance = " + instance.hashCode());
        Singleton instance1 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1.hashCode());
        System.out.println(instance==instance1);
    }


}
//使用静态内部类完成单例模式

/**
 * 在使用静态内部类实现单例模式时，可以将单例对象的创建放在内部类中，
 * 并将该内部类声明为私有的静态类。
 * 静态内部类在第一次使用时才会被加载，因此可以保证单例对象是延迟加载的。
 */
//推薦使用
class Singleton{
    //构造器私有化，外部不能new
    private Singleton(){

    }
    //写一个静态内部类
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    //提供一个公有静态方法，返回实例对象
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}