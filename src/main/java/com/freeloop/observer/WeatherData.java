package com.freeloop.observer;

import lombok.Data;

import java.util.ArrayList;

/**
 * WeatherData
 * 包含最新的天气情况信息
 * 含有观察者集合使用ArrayList管理
 * 当有数据有更新时，就主动调用ArrayList， 通知所有的接入方就看到最新消息
 * @author fj
 * @since 2023/4/15 21:10
 */
@Data
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void dataChange(){
        //调用接入方的update
        this.notifyObservers();
    }
    //当数据有更新时就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        //调用dataChange将最新的消息推送给接入方currentConditions
        dataChange();
    }
    //注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    //移除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) observers.remove(observer);
    }
    //遍历所有的观察者并通知
    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
