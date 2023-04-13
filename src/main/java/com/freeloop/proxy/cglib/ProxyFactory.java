package com.freeloop.proxy.cglib;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ProxyFactory
 *
 * @author fj
 * @since 2023/4/13 13:40
 */
public class ProxyFactory implements MethodInterceptor{
    //维护一个目标对象
    private Object target;
    //传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //返回一个代理对象，目标对象的代理对象
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }
    // intercept()会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始");
        Object invoke = method.invoke(target, args);
        System.out.println("Cglib代理提交");
        return invoke;
    }
}
