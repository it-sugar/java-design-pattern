package com.sugar.behavior.command;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Command command = new TurnOnCommand(light);
        Invoker invoker = new Invoker(command);
        invoker.call();
        System.out.println("----------------------");
        invoker.setCommand(new TurnOffCommand(light));
        invoker.call();
    }

}
