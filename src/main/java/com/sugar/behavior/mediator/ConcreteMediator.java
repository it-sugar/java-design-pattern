package com.sugar.behavior.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gshi
 * 功能描述 具体中介者
 */
public class ConcreteMediator implements Mediator {

    private Set<BaseUser> users = new HashSet<>();

    @Override
    public void register(BaseUser user) {
        users.add(user);
    }

    @Override
    public void relay(String message, BaseUser user) {
        for (BaseUser u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
