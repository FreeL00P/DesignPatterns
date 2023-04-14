package com.freeloop.visitor;

/**
 * Man
 *
 * @author fj
 * @since 2023/4/14 21:09
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
