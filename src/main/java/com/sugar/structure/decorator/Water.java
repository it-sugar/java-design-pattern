package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 水接口
 */
public interface Water {
    /**
     * 返回名称
     *
     * @return 名称
     */
    String name();

    /**
     * 介绍
     */
    void introduce();

    /**
     * 味道
     */
    void taste();

    /**
     * 颜色
     */
    void color();

    /**
     * 功能
     */
    void function();
}
