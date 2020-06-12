package com.sugar.behavior.mediator;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author gshi
 * 功能描述 用户抽象类
 */
@Data
@EqualsAndHashCode
public abstract class BaseUser {

    protected String name;

    protected Mediator mediator;

    public BaseUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * 接收消息
     *
     * @param message 消息
     */
    public abstract void receive(String message);

    /**
     * 转发消息
     *
     * @param message 消息
     */
    public abstract void send(String message);
}
