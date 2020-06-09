package com.sugar.behavior.command;

/**
 * @author gshi
 * 功能描述 调用者
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("invoker 准备执行命令");
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
