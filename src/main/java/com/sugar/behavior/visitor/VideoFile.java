package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 视频文件
 */
public class VideoFile extends BaseFile {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVideoFile(this);
    }
}
