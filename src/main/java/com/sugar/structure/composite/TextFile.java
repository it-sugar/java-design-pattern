package com.sugar.structure.composite;

/**
 * @author gshi
 * 功能描述 文本文件
 */
public class TextFile extends BaseFile {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("我是一个文本文件，我的名字是" + this.name);
    }
}
