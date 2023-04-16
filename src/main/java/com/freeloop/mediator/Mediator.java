package com.freeloop.mediator;

/**
 * Mediator
 *
 * @author fj
 * @since 2023/4/16 11:29
 */

/**
 * 定义了中介者接口，其中有一个sendMessage方法用于接收同事对象发送的消息，
 * 并将消息传递给其他的同事对象。
 */
// 中介者接口
public interface Mediator {
    void sendMessage(String message, Colleague sender);
}
