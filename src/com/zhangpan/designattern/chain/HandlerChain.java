package com.zhangpan.designattern.chain;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public boolean process(Request request) {
        for (Handler handler :
                handlers) {
            Boolean process = handler.process(request);
            if (process != null) {
                System.out.println(request.getName() + "'s request " + (process ? "Approved by" : "Denied by") + handler.getClass().getSimpleName());
                return process;
            }
        }
        throw new RuntimeException("Count not handle request: " + request);
    }
}
