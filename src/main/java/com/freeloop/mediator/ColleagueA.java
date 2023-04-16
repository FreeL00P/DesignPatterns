package com.freeloop.mediator;

/**
 * ColleagueA
 *
 * @author fj
 * @since 2023/4/16 11:31
 */

/**
 * 具体实现了同事类A，
 * 实现了sendMessage方法并在其中通过中介者对象将消息发送给其他的同事对象。
 * 同时，实现了receiveMessage方法，用于接收其他同事对象的消息。
 */
// 具体同事类A
public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ColleagueA received message: " + message);
    }
}

