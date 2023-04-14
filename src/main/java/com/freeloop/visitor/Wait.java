package com.freeloop.visitor;

/**
 * Wait
 *
 * @author fj
 * @since 2023/4/14 21:51
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人表示回家等消息");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人表示回家等消息");
    }
}
