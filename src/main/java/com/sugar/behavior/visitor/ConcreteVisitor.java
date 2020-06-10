package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 实际的访问者
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitTextFile(TextFile textFile) {
        System.out.println("我使用SubLime查看文本文件 " + textFile.getName());
    }

    @Override
    public void visitVideoFile(VideoFile videoFile) {
        System.out.println("我使用PotPlayer查看视频文件 " + videoFile.getName());
    }

    @Override
    public void visitAudioFile(AudioFile audioFile) {
        System.out.println("我使用Foobar2000听音频文件 " + audioFile.getName());
    }
}
