package com.freeloop.facade;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/11 19:30
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
    }
}
