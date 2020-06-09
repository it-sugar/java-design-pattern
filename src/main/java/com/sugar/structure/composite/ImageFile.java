package com.sugar.structure.composite;

/**
 * @author gshi
 * 功能描述 图片文件
 */
public class ImageFile extends BaseFile {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("我是一个图片文件，我的名字是" + this.name);
    }
}
