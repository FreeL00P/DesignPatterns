package com.freeloop.observer;

/**
 * CurrentConditions
 *
 * @author fj
 * @since 2023/4/15 21:06
 */
//观察者
public class CurrentConditions implements  Observer{
    private float temperature;
    private float pressure;
    private float humidity;
    //更新天气情况由WeatherData 来调用，我使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    //显示
    public void display(){
        System.out.println("温度=>"+temperature);
        System.out.println("压力=>"+pressure);
        System.out.println("湿度=>"+humidity);
    }
}
