package com.sugar.structure.bridge;

/**
 * @author gshi
 * 功能描述 黑色
 */
public class Black implements Color {
    @Override
    public void show(String shape) {
        System.out.println("黑色的" + shape);
    }
}
