package com.sugar.behavior.observer;

/**
 * @author gshi
 * 功能描述 抽象观察者
 */
public interface Observer {

    /**
     * 处理接受到的消息
     *
     * @param message
     */
    void handle(String message);

}
