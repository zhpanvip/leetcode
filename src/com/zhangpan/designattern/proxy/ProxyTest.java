package com.zhangpan.designattern.proxy;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {

    public static void main(String[] args) {
//        InvocationHandler handler = (proxy, method, args1) -> {
//            if (method.getName().equals("buyHouse")) {
//                System.out.println(args1[0] + " will buy a house.");
//            }
//            return true;
//        };
//        IPersonBuyHouse proxy = (IPersonBuyHouse) java.lang.reflect.Proxy
//                .newProxyInstance(IPersonBuyHouse.class.getClassLoader(), // ClassLoader
//                        new Class[]{IPersonBuyHouse.class}, // 传入要实现的接口
//                        handler); // 传入处理调用方法的InvocationHandler
//
//        boolean success = proxy.buyHouse("Ryan");


        new Proxy().buyHouse("Ryan");

    }
}
