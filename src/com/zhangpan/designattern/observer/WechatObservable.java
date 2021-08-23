package com.zhangpan.designattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class WechatObservable implements Observable {

    private final List<Observer> list = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    @Override
    public void pushMessage(String message) {
        this.message = message;
        // 通知订阅的用户
        notifyObservers();
    }
}
