package com.freeloop.flyweight;

import java.util.HashMap;

/**
 * WebSiteFactory
 *
 * @author fj
 * @since 2023/4/11 21:29
 */
//网站工厂类 根据需求返回一个网站
public class WebSiteFactory {
    //集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool=new HashMap();
    //根据网站的类型返回一个网站，如果没有就创建就创建一个网站并放入到池中，并返回
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            //创建一个
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }
    //获取网站分类总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
