package com.sugar.behavior.observer;

/**
 * @author gshi
 * 功能描述 业务方
 */
public class BusinessObserver implements Observer {
    @Override
    public void handle(String message) {
        System.out.println("业务集群 接收到消息[" + message + "]并处理~");
    }
}
