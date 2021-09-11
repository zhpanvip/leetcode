package com.zhangpan.designattern.chain;

/**
 * 抽象一个请求对象，它负责在责任链上传递
 */
public class Request {
    private String name;
    private double amount;

    public Request(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
