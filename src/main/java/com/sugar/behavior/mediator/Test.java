package com.sugar.behavior.mediator;

/**
 * @author gshi
 * 功能描述 测试类
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        BaseUser foreUser = new ForeGroundUser("前台用户", mediator);
        BaseUser backUser1 = new BackGroundUser("后台用户1", mediator);
        BaseUser backUser2 = new BackGroundUser("后台用户2", mediator);
        mediator.register(foreUser);
        mediator.register(backUser1);
        mediator.register(backUser2);
        foreUser.send("大家好呀，我是前台用户");
        System.out.println("-----------");
        backUser1.send("你好，我是后台开发！");
    }

}
