package com.zhangpan.designattern.singleton;

public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("通过枚举单利打印日志...");
    }

}
