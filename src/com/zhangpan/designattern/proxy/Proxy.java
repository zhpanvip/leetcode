package com.zhangpan.designattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements IPersonBuyHouse {

    InvocationHandler handler = new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            if (method.getName().equals("buyHouse")) {
                System.out.println(args[0] + " will buy a house.");
            }
            return true;
        }
    };

    @Override
    public boolean buyHouse(String name) {
        try {
            Method buyHouseMethod = IPersonBuyHouse.class.getDeclaredMethod("buyHouse", String.class);
            Object[] params = new Object[1];
            params[0] = name;
            return (boolean) handler.invoke(this, buyHouseMethod, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }
}
