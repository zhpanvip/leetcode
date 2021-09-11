package com.zhangpan.designattern.chain;

public class Test {
    public static void main(String[] args) {
        // 构造责任链:
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());

        // 处理请求:
        chain.process(new Request("Bob", 123.45));
        chain.process(new Request("Alice", 1234.56));
        chain.process(new Request("Bill", 12345.67));
        chain.process(new Request("John", 123456.78));

    }
}
