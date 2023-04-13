package com.freeloop.proxy.dynamic;

/**
 * TeacherDao
 *
 * @author fj
 * @since 2023/4/13 12:30
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中......");
    }
}
