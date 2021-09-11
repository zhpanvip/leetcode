package com.zhangpan.designattern.chain;

public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount() >= 10000) {
            // 超过1000元，处理不了，交给上级处理
            return null;
        }
        return true;
    }
}
