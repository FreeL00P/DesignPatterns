package com.freeloop.visitor;

/**
 * Action
 *
 * @author fj
 * @since 2023/4/14 21:06
 */
public abstract class Action {
    //得到男性的测评结果
    public abstract void getManResult(Man man);
    //得到女性的测评结果
    public abstract void getWomanResult(Woman man);
}
