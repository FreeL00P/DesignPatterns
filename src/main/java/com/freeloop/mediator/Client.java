package com.freeloop.mediator;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/16 11:31
 */
// 客户端代码
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.sendMessage("Hello colleagueB!");

        colleagueB.sendMessage("Hi colleagueA!");
    }
}

