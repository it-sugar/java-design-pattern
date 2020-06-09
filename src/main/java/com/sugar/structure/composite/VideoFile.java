package com.sugar.structure.composite;

/**
 * @author gshi
 * 功能描述 视频文件
 */
public class VideoFile extends BaseFile {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("我是一个视频文件，我的名字是" + this.name);
    }
}
