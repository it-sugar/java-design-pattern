package com.sugar.structure.flyweight;

/**
 * @author gshi
 * 功能描述 测试类
 */
public class Test {

    public static void main(String[] args) {
        DreamCarBarn dreamCarBarn = DreamCarBarn.getInstance();
        dreamCarBarn.getCar(DreamCarBarn.BMW_CAR).show("白色");
        dreamCarBarn.getCar(DreamCarBarn.BMW_CAR).show("黑色");
        System.out.println("--------------");
        dreamCarBarn.getCar(DreamCarBarn.FORD_CAR).show("红色");
        dreamCarBarn.getCar(DreamCarBarn.FORD_CAR).show("黑色");
        System.out.println("--------------");
        dreamCarBarn.getCar(DreamCarBarn.TOYOTA_CAR).show("白色");
        dreamCarBarn.getCar(DreamCarBarn.TOYOTA_CAR).show("黑色");
    }

}
