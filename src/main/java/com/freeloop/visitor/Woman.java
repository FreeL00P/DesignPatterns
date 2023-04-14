package com.freeloop.visitor;

/**
 * Woman
 *
 * @author fj
 * @since 2023/4/14 21:09
 */
//这里我们使用到了双分派，即首先在客户端程序中，
// 将具体的状态作为参数传递到了Woman中完成了一次分派
// 然后Woman这个类里面调用了作为参数的具体方法中的方法getWomanResult
//同时将自己this作为参数传入，2完成第二次的分派
public class Woman extends Person{
    @Override
    //接受action
    public void accept(Action action) {
        //把自己传进去
        action.getWomanResult(this);
    }
}
