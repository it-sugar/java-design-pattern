package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 装饰器
 */
public abstract class BaseDecorator implements Water {

    protected Water water;

    public BaseDecorator(Water water) {
        this.water = water;
    }

    @Override
    public void introduce() {
        this.color();
        this.taste();
        this.function();
    }

    @Override
    public void taste() {
        this.water.taste();
    }

    @Override
    public void color() {
        this.water.color();
    }

    @Override
    public void function() {
        this.water.function();
    }
}
