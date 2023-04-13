package com.freeloop.proxy.staticproxy;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/13 10:57
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
