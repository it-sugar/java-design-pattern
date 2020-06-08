package com.sugar.structure.bridge;

/**
 * @author gshi
 * 功能描述 形状
 */
public abstract class BaseShape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 绘制
     */
    public abstract void draw();
}
