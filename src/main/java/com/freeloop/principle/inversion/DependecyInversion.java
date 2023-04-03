package com.freeloop.principle.inversion;

/**
 * DependcyInversion
 * 依赖倒转原则
 * @author fj
 * @since 2023/4/3 21:57
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.recieve(new Email());
    }
}
class Email{
    public String getInfo(){
        return "Email==>INFO==>Hello";
    }
}

/**
 * 完成Person接受消息的功能
 * 方式1分析
 * 1 简单，比较容易想到
 * 2 如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接受方法
 * 3 解决思路：引入一个抽象的接口IReceiver，表接受者，这样Person与接口发生依赖
 *  因为Email WeChat都属于接收的范围，他们各自实现iReceiver接口就OK，这样就符合依赖倒转原则
 *
 */
class Person {
    public void recieve(Email email){
        System.out.println(email.getInfo());
    }
}