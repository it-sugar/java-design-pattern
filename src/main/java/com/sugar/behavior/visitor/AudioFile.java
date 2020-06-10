package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 音频文件
 */
public class AudioFile extends BaseFile {

    public AudioFile(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAudioFile(this);
    }
}
