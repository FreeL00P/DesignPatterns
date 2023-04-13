package com.freeloop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyFactory
 *
 * @author fj
 * @since 2023/4/13 12:31
 */
public class ProxyFactory {
    //维护一个目标对象，Object
    private Object target;
    //通过构造器传入目标对象，初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                 Class<?>[] interfaces,
         *                 InvocationHandler h)
         * 1 ClassLoader loader:指当前目标对象使用的类加载器，获取加载器的方法固定
         * 2 Class<>() interface:目标对象实现的接口，使用泛型方法确认实现
         * 3 InvocationHandler h:事件处理器，执行目标方法时，会触发事情处理器方法
         * 会把当前执行的目标对象方法作为一个参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("==>JDK代理<==");
                        //反射调用目标对象的方法
                        return method.invoke(target, args);
                    }
                });
    }
}
