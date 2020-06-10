package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 访问者
 */
public interface Visitor {

    /**
     * 访问文本文件
     *
     * @param textFile 文本文件对象
     */
    void visitTextFile(TextFile textFile);

    /**
     * 访问视频文件
     *
     * @param videoFile 视频文件对象
     */
    void visitVideoFile(VideoFile videoFile);

    /**
     * 访问音频文件
     *
     * @param audioFile 音频文件对象
     */
    void visitAudioFile(AudioFile audioFile);
}
