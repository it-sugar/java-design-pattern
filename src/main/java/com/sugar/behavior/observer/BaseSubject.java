package com.sugar.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gshi
 * 功能描述 抽象目标类
 */
public abstract class BaseSubject {

    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     * @param message 消息体
     */
    public abstract void notifyObservers(String message);
}
