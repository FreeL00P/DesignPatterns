package com.freeloop.principle.inversion.improve;

/**
 * DependecyInversion
 *
 * @author fj
 * @since 2023/4/3 22:09
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.recieve(new Email());
        person.recieve(new WeChat());
    }
}


//定义接口
interface IReceiver{
    String getInfo();
}
class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "Email==>INFO==>Hello";
    }
}
class WeChat implements IReceiver{
    @Override
    public String getInfo() {
        return "WeChat==>INFO==>HELLO";
    }
}
class Person {
    public void recieve(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}