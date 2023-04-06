package com.freeloop.singleton.type02;

/**
 * SingletonTest01
 * 单例模式
 * @author fj
 * @since 2023/4/6 14:20
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("instance = " + instance.hashCode());
        Singleton instance1 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1.hashCode());
        System.out.println(instance==instance1);
    }
}
//饿汉式（静态代码块）
class Singleton{
    //构造器私有化，外部不能new
    private Singleton(){

    }
    //本类内部创建对象实例
    private static final Singleton instance;
    static {
        //在静态代码块中创建单例对象
        instance = new Singleton();
    }

    //提供一个公有静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
