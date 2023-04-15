package com.freeloop.observer;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/15 21:26
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        //测试
        System.out.println("通知各个注册的观察者");
        weatherData.setData(10f,100f,30.3f);
    }
}
