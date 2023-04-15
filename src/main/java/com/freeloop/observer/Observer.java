package com.freeloop.observer;

/**
 * Observer
 *
 * @author fj
 * @since 2023/4/15 21:03
 */
//观察者接口
public interface Observer {
    /**
     *
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    void update(float temperature,float pressure,float humidity);

}
