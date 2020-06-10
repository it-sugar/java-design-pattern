package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 文本文件
 */
public class TextFile extends BaseFile {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTextFile(this);
    }
}
