package com.sugar.behavior.observer;

/**
 * @author gshi
 * 功能描述 Storm集群观察者
 */
public class StormObserver implements Observer {
    @Override
    public void handle(String message) {
        System.out.println("Storm集群 接收到消息[" + message + "]并处理~");
    }
}
