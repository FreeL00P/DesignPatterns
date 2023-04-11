package com.freeloop.flyweight;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/11 21:36
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite web1 = webSiteFactory.getWebSiteCategory("news");
        web1.use(new User("cxk"));
        WebSite web2= webSiteFactory.getWebSiteCategory("news");
        web1.use(new User("cxk2"));
        WebSite web3 = webSiteFactory.getWebSiteCategory("news");
        web1.use(new User("cxk3"));
        WebSite web4 = webSiteFactory.getWebSiteCategory("news");
        web1.use(new User("cxk4"));
        //获取webSite大小
        int webSiteCount = webSiteFactory.getWebSiteCount();
        System.out.println("webSiteCount = " + webSiteCount);
    }
}
