package com.sugar.behavior.mediator;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author gshi
 * 功能描述 后台人员
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BackGroundUser extends BaseUser {


    public BackGroundUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("后台人员 " + this.name + " 接收到消息 -> " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("后台人员 " + this.name + " 发送消息 -> " + message);
        this.mediator.relay(message, this);

    }
}
