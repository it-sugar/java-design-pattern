package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 测试类
 */
public class Test {

    public static void main(String[] args) {

        Water water = new GlucoseWater(new NormalWater());
        water.introduce();

        water = new MilkyTeaDecorator(new NormalWater());
        water.introduce();
    }
}
