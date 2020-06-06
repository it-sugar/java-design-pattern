package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 苹果手机
 */
public class ApplePhone implements Phone {
    @Override
    public void introduce() {
        System.out.println("大家好，我是苹果手机！");
    }
}
