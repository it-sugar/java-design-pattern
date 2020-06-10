package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 测试类
 */
public class Test {

    public static void main(String[] args) {
        final Visitor visitor = new ConcreteVisitor();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addFile(new TextFile("日志.log"));
        objectStructure.addFile(new AudioFile("梦中的婚礼.mp3"));
        objectStructure.addFile(new VideoFile("肖申克的救赎.mkv"));
        objectStructure.visitor(visitor);
    }

}
