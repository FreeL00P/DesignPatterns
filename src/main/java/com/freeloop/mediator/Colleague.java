package com.freeloop.mediator;

/**
 * Colleague
 *
 * @author fj
 * @since 2023/4/16 11:30
 */

/**
 * 定义了抽象同事类，
 * 其中保存了对中介者对象的引用，
 * 并声明了两个抽象方法：sendMessage和receiveMessage。
 */
// 抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}

