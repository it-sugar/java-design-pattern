package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 电子产品工厂
 */
public interface ElectronicFactory {

    /**
     * 获取电脑对象
     *
     * @return 电脑
     */
    Computer getComputer();

    /**
     * 获取手机对象
     *
     * @return 手机
     */
    Phone getPhone();
}
