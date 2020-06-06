package com.sugar.create.prototype;

/**
 * @author gshi
 * 功能描述 原型类
 */
public class Prototype implements Cloneable {

    private String name;

    public Prototype(String name) {
        this.name = name;
        System.out.println("原型类创建成功！");
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
