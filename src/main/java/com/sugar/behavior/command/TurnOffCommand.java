package com.sugar.behavior.command;

/**
 * @author gshi
 * 功能描述 关闭命令
 */
public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
