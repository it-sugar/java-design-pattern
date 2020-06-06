package com.sugar.create.factory.method;

/**
 * @author gshi
 * 功能描述 可口可乐工厂
 */
public class CocaColaFactory implements Factory {
    @Override
    public Cola createCola() {
        return new CocaCola();
    }
}
