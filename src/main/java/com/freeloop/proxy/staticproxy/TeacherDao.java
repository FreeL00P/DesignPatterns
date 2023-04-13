package com.freeloop.proxy.staticproxy;

/**
 * TeacherDao
 *
 * @author fj
 * @since 2023/4/13 10:50
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
