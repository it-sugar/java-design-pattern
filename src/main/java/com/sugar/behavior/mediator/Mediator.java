package com.sugar.behavior.mediator;

/**
 * @author gshi
 * 功能描述 中介
 */
public interface Mediator {

    /**
     * 注册用户
     *
     * @param user 用户
     */
    void register(BaseUser user);

    /**
     * 转发信息
     *
     * @param message 信息
     * @param user    用户
     */
    void relay(String message, BaseUser user);

}
