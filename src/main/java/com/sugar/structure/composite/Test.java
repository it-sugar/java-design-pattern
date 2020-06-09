package com.sugar.structure.composite;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        Folder root = new Folder("D盘");
        Folder subFolder = new Folder("软件");
        BaseFile videoFile = new VideoFile("操作视频.mp4");
        BaseFile textFile = new TextFile("access.log");
        BaseFile imageFile = new ImageFile("logo.png");
        root.add(videoFile);
        subFolder.add(textFile);
        subFolder.add(imageFile);
        root.add(subFolder);
        // 开始展示
        root.display();
    }
}
