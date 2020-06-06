package com.sugar.create.factory.simple;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        final Cola firstCola = Factory.getCola("coca");
        System.out.println(firstCola.getBrand());
        final Cola secondCola = Factory.getCola("pepsi");
        System.out.println(secondCola.getBrand());

    }

}
