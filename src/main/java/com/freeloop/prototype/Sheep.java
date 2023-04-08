package com.freeloop.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Sheep
 *
 * @author fj
 * @since 2023/4/8 12:10
 */
@AllArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    private Sheep friend;
    //克隆该实例，使用默认的克隆方法完成
    @Override
    protected Sheep clone()  {
        Sheep sheep=null;
        try {
           sheep=(Sheep) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String name() {
        return name;
    }

    public Sheep setName(String name) {
        this.name = name;
        return this;
    }

    public int age() {
        return age;
    }

    public Sheep setAge(int age) {
        this.age = age;
        return this;
    }

    public String color() {
        return color;
    }

    public Sheep setColor(String color) {
        this.color = color;
        return this;
    }

    public Sheep friend() {
        return friend;
    }

    public Sheep setFriend(Sheep friend) {
        this.friend = friend;
        return this;
    }
}
