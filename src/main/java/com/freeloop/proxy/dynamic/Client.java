package com.freeloop.proxy.dynamic;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/13 12:51
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //给目标对象创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
