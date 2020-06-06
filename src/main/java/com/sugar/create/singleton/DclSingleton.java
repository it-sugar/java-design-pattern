package com.sugar.create.singleton;

/**
 * @author gshi
 * 功能描述 双重校验锁模式
 */
public class DclSingleton {

    private volatile static DclSingleton singleton;

    private DclSingleton() {
    }

    public static DclSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DclSingleton.class) {
                if (singleton == null) {
                    singleton = new DclSingleton();
                }
            }
        }
        return singleton;
    }
}
