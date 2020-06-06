package com.sugar.create.prototype;

/**
 * @author gshi
 * 功能描述 测试功能
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("test-1");
        Prototype cloneObject = prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(cloneObject.getName());
        System.out.println(prototype == cloneObject);
    }
}
