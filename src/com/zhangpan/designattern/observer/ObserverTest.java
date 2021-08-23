package com.zhangpan.designattern.observer;

public class ObserverTest {
    public static void main(String[] args) {

        WechatObservable wechatObservable = new WechatObservable();
        UserObserver ryan = new UserObserver("Ryan");
        UserObserver frank = new UserObserver("Mike");

        wechatObservable.addObserver(ryan);
        wechatObservable.addObserver(frank);

        wechatObservable.pushMessage("第三次分配来了！实现共同富裕再放大招！");
    }
}
