package com.sugar.behavior.visitor;

/**
 * @author gshi
 * 功能描述 文件
 */
public abstract class BaseFile {

    private String name;

    public BaseFile(String name) {
        this.name = name;
    }

    /**
     * 接受visitor的访问
     *
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);

    public String getName() {
        return this.name;
    }
}
