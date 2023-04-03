package com.freeloop.principle.segregation;

/**
 * Segregation1
 * 接口隔离原则
 * @author fj
 * @since 2023/4/3 20:57
 */
public class Segregation1 {
}

interface Interface1{
    void fun1();
    void fun2();
    void fun3();
    void fun4();
    void fun5();
}

class B implements Interface1{
    @Override
    public void fun1() {
        System.out.println("fun1 =B ");
    }

    @Override
    public void fun2() {
        System.out.println("fun1 =B ");
    }

    @Override
    public void fun3() {
        System.out.println("fun1 =B ");
    }

    @Override
    public void fun4() {
        System.out.println("fun4 = B");
    }

    @Override
    public void fun5() {
        System.out.println("fun5 =B");
    }
}

class D implements Interface1{
    @Override
    public void fun1() {
        System.out.println("fun1 =D ");
    }

    @Override
    public void fun2() {
        System.out.println("fun1 =D ");
    }

    @Override
    public void fun3() {
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
    //A类通过接口interface1 依赖b类，但是只会用到123方法
    public void depend1(Interface1 i){
        i.fun1();
    }
    public void depend2(Interface1 i){
        i.fun2();
    }
    public void depend3(Interface1 i){
        i.fun3();
    }
}

class C{
    //A类通过接口interface1 依赖b类，但是只会用到123方法
    public void depend1(Interface1 i){
        i.fun1();
    }
    public void depend4(Interface1 i){
        i.fun4();
    }
    public void depend5(Interface1 i){
        i.fun5();
    }
}