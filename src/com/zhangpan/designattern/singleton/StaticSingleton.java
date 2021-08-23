package com.zhangpan.designattern.singleton;

public class StaticSingleton {
    private StaticSingleton singleton;

    private StaticSingleton() {
    }

    private static class SingletonHolder {
        public static StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
