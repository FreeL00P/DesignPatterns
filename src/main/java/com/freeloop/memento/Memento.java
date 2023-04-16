package com.freeloop.memento;

/**
 * Memento
 *
 * @author fj
 * @since 2023/4/16 14:38
 */
//备忘录
public class Memento {
    private String state;

    public Memento(String state) {
        super();
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
