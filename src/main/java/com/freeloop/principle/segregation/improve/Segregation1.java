package com.freeloop.principle.segregation.improve;

/**
 * Segregation1
 * 将接口拆分为独立的几个接口，这里我们拆分为3个，
 * 类A和类C分别于他们需要的接口建立关系
 * 也就是采用接口隔离原则
 * @author fj
 * @since 2023/4/3 21:21
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口依赖B类
        a.depend2(new B());
        a.depend3(new B());


        C c = new C();
        c.depend1(new D());//C类通过接口依赖D
        c.depend4(new D());
        c.depend5(new D());
    }
}
interface Interface1{
    void fun1();
}
interface Interface2{
    void fun2();
    void fun3();
}
interface Interface3{
    void fun4();
    void fun5();
}
class B implements Interface1,Interface2 {
    @Override
    public void fun1() {
        System.out.println("fun1 =B ");
    }

    @Override
    public void fun2() {
        System.out.println("fun2 =B ");
    }

    @Override
    public void fun3() {
        System.out.println("fun3 =B ");
    }

}

class D implements Interface1,Interface3 {
    @Override
    public void fun1() {
        System.out.println("fun1 =D ");
    }

    @Override
    public void fun4() {
        System.out.println("fun4 = D");
    }

    @Override
    public void fun5() {
        System.out.println("fun5 =D");
    }
}
class A{
    //A类通过接口interface1,Interface2 依赖b类，但是只会用到123方法
    public void depend1(Interface1 i){
        i.fun1();
    }
    public void depend2(Interface2 i){
        i.fun2();
    }
    public void depend3(Interface2 i){
        i.fun3();
    }
}

class C{
    //A类通过接口interface1 依赖b类，但是只会用到123方法
    public void depend1(Interface1 i){
        i.fun1();
    }
    public void depend4(Interface3 i){
        i.fun4();
    }
    public void depend5(Interface3 i){
        i.fun5();
    }
}