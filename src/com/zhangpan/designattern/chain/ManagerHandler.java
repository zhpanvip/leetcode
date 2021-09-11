package com.zhangpan.designattern.chain;

public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount() >= 1000) {
            // 超过1000元，处理不了，交给上级处理
            return null;
        }
        // 对Bob有偏见，Bob的请求直接拒绝
        return !request.getName().equals("Bob");
    }
}
