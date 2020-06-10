package com.sugar.behavior.chainofresponsibility;

/**
 * @author gshi
 * 功能描述 数学题枚举
 */
public enum MathematicalProblem {

    /**
     * 简单数学题
     */
    SIMPLE_MATH("简单数学题"),

    /**
     * 三角函数
     */
    TRIGONOMETRIC_FUNCTION("三角函数题"),

    /**
     * 高等数学
     */
    HIGHER_MATHEMATICS("高等数学题");

    private String name;

    MathematicalProblem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
