package com.freeloop.visitor;

/**
 * success
 *
 * @author fj
 * @since 2023/4/14 21:13
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人给的评价是很成功");
    }
}
