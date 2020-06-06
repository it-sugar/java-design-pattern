package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 小米电脑
 */
public class MiComputer implements Computer {
    @Override
    public void introduce() {
        System.out.println("大家好，我是小米电脑！");
    }
}
