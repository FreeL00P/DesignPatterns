package com.freeloop.visitor;

/**
 * Person
 *
 * @author fj
 * @since 2023/4/14 21:09
 */
public abstract class Person {
    //通过一个方法让访问者可以访问
    public abstract void accept(Action action);

}
