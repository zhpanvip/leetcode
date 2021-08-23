package com.zhangpan.designattern.observer;

/**
 * 观察者实现
 */
public class UserObserver implements Observer {

    private String name;
    private String message;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        readMessage();
    }

    private void readMessage() {
        System.out.println(name + "收到一条消息：" + message);
    }
}
