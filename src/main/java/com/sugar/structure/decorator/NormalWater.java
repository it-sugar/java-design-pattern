package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 普通水
 */
public class NormalWater implements Water {


    @Override
    public String name() {
        return "普通的水";
    }

    @Override
    public void introduce() {
        System.out.println("我是一杯普通的水");
    }

    @Override
    public void taste() {
        System.out.println("我没什么特殊的味道");
    }

    @Override
    public void color() {
        System.out.println("我是透明的");
    }

    @Override
    public void function() {
        System.out.println("我可以用来解渴");
    }
}
