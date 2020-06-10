package com.sugar.behavior.observer;

/**
 * @author gshi
 * 功能描述 ElasticSearch集群观察者
 */
public class ElasticSearchObserver implements Observer {
    @Override
    public void handle(String message) {
        System.out.println("ElasticSearch 接收到消息[" + message + "]并进行处理~");
    }
}
