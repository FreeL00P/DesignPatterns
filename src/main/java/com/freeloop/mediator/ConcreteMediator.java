package com.freeloop.mediator;

/**
 * ConcreteMediator
 *
 * @author fj
 * @since 2023/4/16 11:30
 */

/**
 * 实现了中介者接口，
 * 其中保存了对所有同事对象的引用。
 * 当有同事对象发送消息时，
 * 根据消息的来源不同将消息传递给不同的同事对象。
 */
// 具体中介者类
public class ConcreteMediator implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        if (sender == colleagueA) {
            colleagueB.receiveMessage(message);
        } else {
            colleagueA.receiveMessage(message);
        }
    }
}

