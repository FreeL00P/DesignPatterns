package com.freeloop.memento;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/16 14:48
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1");
        //保存了当前的状态
        Memento memento = originator.saveStateMemento();
        caretaker.addMemento(memento);
        System.out.println(originator.getState());

        originator.setState("状态2");
        caretaker.addMemento(originator.saveStateMemento());
        System.out.println(originator.getState());
        //回复到状态1
        Memento memento1 = caretaker.get(0);
        originator.getStateFromMemento(memento1);
        System.out.println(originator.getState());
    }
}
