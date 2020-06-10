package com.sugar.behavior.observer;


/**
 * @author gshi
 * 功能描述 具体目标类
 */
public class ConcreteSubject extends BaseSubject {
    @Override
    public void notifyObservers(String message) {
        this.observers.forEach(e -> e.handle(message));
    }
}
