package com.freeloop.visitor;

/**
 * Fail
 *
 * @author fj
 * @since 2023/4/14 21:14
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是该回家了");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人给的评价是该回家了");
    }
}
