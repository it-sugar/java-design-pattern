package com.sugar.structure.flyweight;

/**
 * @author gshi
 * 功能描述 宝马汽车
 */
public class BmwCar extends BaseCar {

    public BmwCar() {
        System.out.println("一辆宝马汽车被初始创建了");
    }

    @Override
    public void show(String color) {
        if (null != this.color && !this.color.equals(color)) {
            System.out.println(this.color + "宝马车重新喷漆, 新颜色为" + color);
        }
        this.color = color;
        System.out.println("这是一辆" + color + "颜色的宝马车");
    }
}
