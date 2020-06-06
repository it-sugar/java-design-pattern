package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 苹果工厂
 */
public class AppleFactory implements ElectronicFactory {
    @Override
    public Computer getComputer() {
        return new AppleComputer();
    }

    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
