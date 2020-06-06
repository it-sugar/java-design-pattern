package com.sugar.create.factory.simple;

/**
 * @author gshi
 * 功能描述 工厂类
 */
public class Factory {

    public static final String COCA_COLA = "coca";
    public static final String PEPSI_COLA = "pepsi";

    public static Cola getCola(String name) {
        if (null == name) {
            throw new IllegalArgumentException("请勿传入空值！");
        }
        if (COCA_COLA.equalsIgnoreCase(name)) {
            return new CocaCola();
        } else if (PEPSI_COLA.equalsIgnoreCase(name)) {
            return new PepsiCola();
        } else {
            throw new IllegalArgumentException("暂未支持该类型可乐！");
        }
    }
}
