package com.freeloop.observer;

/**
 * Subject
 *
 * @author fj
 * @since 2023/4/15 21:02
 */
//被观察者接口，需要让WeatherData实现
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
