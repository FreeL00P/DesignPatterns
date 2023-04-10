package com.freeloop.composite;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/10 17:11
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent university = new University("湖南工厂学院", "学校");
        OrganizationComponent collage = new Collage("计算机学院", "计算机");
        OrganizationComponent collage1 = new Collage("化学学院", "化学");
        OrganizationComponent collage2 = new Collage("数学学院", "数学");
        collage.add(new Department("软件工程", "软工"));
        collage.add(new Department("计算机科学与技术", "码农"));
        collage.add( new Department("计算机网络", "网工"));
        university.add(collage);
        university.add(collage1);
        university.add(collage2);
        university.print();
    }
}
