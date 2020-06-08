package com.sugar.structure.flyweight;

/**
 * @author gshi
 * 功能描述 抽象享元角色
 */
public abstract class BaseCar {

    protected String color;

    /**
     * 展示方法
     *
     * @param color 颜色信息
     */
    abstract void show(String color);

}
