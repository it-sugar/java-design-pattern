package com.sugar.create.singleton;

/**
 * @author gshi
 * 功能描述 枚举单例模式
 */
public enum EnumSingleton {

    /**
     * 单例对象
     */
    INSTANCE;

    /**
     * 可以省略此方法，通过Singleton.INSTANCE进行操作
     *
     * @return 单例对象
     */
    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}
