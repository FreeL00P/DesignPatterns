package com.freeloop.prototype;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/8 12:57
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack", 2, "黑色"));
        System.out.println(sheep.hashCode());
        System.out.println("sheep = " + sheep);
        System.out.println("clone = "+sheep.friend().hashCode());
        Sheep clone = sheep.clone();
        System.out.println(clone.hashCode());
        System.out.println("clone = " + clone);
        System.out.println("clone = "+clone.friend().hashCode());
    }
}
