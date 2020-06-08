package com.sugar.structure.flyweight;

/**
 * @author gshi
 * 功能描述 福特汽车
 */
public class FordCar extends BaseCar {

    public FordCar() {
        System.out.println("一辆福特汽车被初始创建了");
    }

    @Override
    public void show(String color) {
        if (null != this.color && !this.color.equals(color)) {
            System.out.println(this.color + "福特车重新喷漆, 新颜色为" + color);
        }
        this.color = color;
        System.out.println("这是一辆" + color + "福特的宝马车");
    }
}
