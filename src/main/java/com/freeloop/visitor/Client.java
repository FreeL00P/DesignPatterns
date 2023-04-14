package com.freeloop.visitor;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/14 21:27
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        Fail fail = new Fail();
        //查看当前结果
        objectStructure.display(fail);

        System.out.println("<==>");
        objectStructure.attach(new Man());
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("<==>");
        Wait wait = new Wait();
        objectStructure.attach(new Woman());
        objectStructure.display(wait);
    }
}
