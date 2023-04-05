package com.freeloop.principle.liskov;

/**
 * Liskov
 * 里氏替换原则
 * @author fj
 * @since 2023/4/5 11:07
 */
public class Liskov {
}
//创建一个更加基础的基类
class Base{
    //把更加基础的方法和属性写到Base类中
    public int func1(int num1,int num2){
        return num1-num2;
    }
}
class A extends Base{
    //返回两个数的差
    public int func1(int num1,int num2){
        return num1-num2;
    }
}
//B继承了A
//增加了一个新功能func2()
class B extends Base{
    //如果B需要使用A类的方法，使用组合关系
    private  A a =new A();
    @Override
    public int func1(int a,int b){
        return a+b;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    //使用A类的方法
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}