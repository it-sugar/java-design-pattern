package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 小米手机
 */
public class MiPhone implements Phone {
    @Override
    public void introduce() {
        System.out.println("大家好，我是小米手机！");
    }
}
