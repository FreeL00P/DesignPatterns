package com.freeloop.flyweight;

/**
 * User
 *
 * @author fj
 * @since 2023/4/11 21:42
 */
//享元模式的外部状态
public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username) {
        this.username = username;
    }
}
