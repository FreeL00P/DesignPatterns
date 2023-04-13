package com.freeloop.proxy.cglib;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/13 13:56
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取代理对象，将目标对象传递给代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        //执行代理对象的方法，触发intercept()方法从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
