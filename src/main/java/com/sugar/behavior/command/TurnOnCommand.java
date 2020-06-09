package com.sugar.behavior.command;

/**
 * @author gshi
 * 功能描述 打开灯命令
 */
public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
