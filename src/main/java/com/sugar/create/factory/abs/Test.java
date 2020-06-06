package com.sugar.create.factory.abs;

/**
 * @author gshi
 * 功能描述 测试类
 * 抽象工厂与工厂方法基本都是差不多的，只不过工厂方法是创建单一产品，而抽象工厂是创建同一产品族的所有产品，
 * 一个是生产同一种产品的工厂，一个是生产一系列产品的工厂
 */
public class Test {

    public static void main(String[] args) {
        ElectronicFactory electronicFactory = new AppleFactory();
        electronicFactory.getComputer().introduce();
        electronicFactory.getPhone().introduce();

        System.out.println("----------------");

        electronicFactory = new MiFactory();
        electronicFactory.getComputer().introduce();
        electronicFactory.getPhone().introduce();
    }
}
