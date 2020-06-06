package com.sugar.create.factory.method;

/**
 * @author gshi
 * 功能描述 测试类
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new CocaColaFactory();
        System.out.println(factory.createCola().getBrand());
        System.out.println("--------------------");
        factory = new PepsiColaFactory();
        System.out.println(factory.createCola().getBrand());
    }
}
