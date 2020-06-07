package com.sugar.structure.adapter;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("类的适配器模式->");
        Target target = new ClassAdapter();
        target.targetMethod();
        System.out.println("对象的适配器模式->");
        target = new ObjectAdapter(new Adaptee());
        target.targetMethod();
    }
}
