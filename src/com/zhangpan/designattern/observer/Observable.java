package com.zhangpan.designattern.observer;

/**
 * 被观察者抽象层
 */
public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    // 发布消息
    void pushMessage(String message);
}
