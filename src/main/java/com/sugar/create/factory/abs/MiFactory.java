package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 小米工厂
 */
public class MiFactory implements ElectronicFactory {
    @Override
    public Computer getComputer() {
        return new MiComputer();
    }

    @Override
    public Phone getPhone() {
        return new MiPhone();
    }
}
