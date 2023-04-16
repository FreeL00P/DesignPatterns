package com.freeloop.mediator;

/**
 * ColleagueB
 *
 * @author fj
 * @since 2023/4/16 11:31
 */
// 具体同事类B
public class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ColleagueB received message: " + message);
    }
}

