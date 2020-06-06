package com.sugar.create.factory.method;

/**
 * @author gshi
 * 功能描述 百事可乐工厂
 */
public class PepsiColaFactory implements Factory {
    @Override
    public Cola createCola() {
        return new PepsiCola();
    }
}
