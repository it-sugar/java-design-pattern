package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 苹果电脑
 */
public class AppleComputer implements Computer {
    @Override
    public void introduce() {
        System.out.println("大家好，我是苹果电脑！");
    }
}
