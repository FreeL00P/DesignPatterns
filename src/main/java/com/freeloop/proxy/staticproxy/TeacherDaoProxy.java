package com.freeloop.proxy.staticproxy;

/**
 * TeacherDaoProxy
 *
 * @author fj
 * @since 2023/4/13 10:51
 */
//代理对象
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;//目标对象通过接口来关联
    //构造器注入
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        target.teach();
        System.out.println("提交...");
    }
}
