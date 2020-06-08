package com.sugar.structure.bridge;

/**
 * @author gshi
 * 功能描述 白色
 */
public class White implements Color {
    @Override
    public void show(String shape) {
        System.out.println("白色的" + shape);
    }
}
