package com.zhangpan.designattern.chain;

/**
 * 抽象处理器
 */
public interface Handler {
    /**
     *
     * @param request
     * @return true 成功，false 拒绝，null 交给下一个处理
     */
    Boolean process(Request request);
}
