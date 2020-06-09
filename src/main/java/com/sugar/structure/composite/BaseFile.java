package com.sugar.structure.composite;

/**
 * @author gshi
 * 功能描述 文件抽象类
 */
public abstract class BaseFile {

    String name;

    public BaseFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 展示方法
     */
    public abstract void display();
}
