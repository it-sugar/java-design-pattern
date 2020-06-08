package com.sugar.structure.flyweight;

/**
 * @author gshi
 * 功能描述 丰田汽车
 */
public class ToyotaCar extends BaseCar {

    public ToyotaCar() {
        System.out.println("一辆丰田汽车被初始创建了");
    }

    @Override
    public void show(String color) {
        if (null != this.color && !this.color.equals(color)) {
            System.out.println(this.color + "丰田车重新喷漆, 新颜色为" + color);
        }
        this.color = color;
        System.out.println("这是一辆" + color + "丰田的宝马车");
    }
}
