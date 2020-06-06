package com.sugar.create.singleton;

/**
 * @author gshi
 * 功能描述 静态内部类单例模式
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
