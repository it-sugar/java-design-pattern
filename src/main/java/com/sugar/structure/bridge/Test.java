package com.sugar.structure.bridge;

/**
 * @author gshi
 * 功能描述 测试
 * 注意这里Shape和Color用的是组合关系
 */
public class Test {

    public static void main(String[] args) {
        Color white = new White();
        BaseShape circle = new Circle();
        circle.setColor(white);
        circle.draw();
        System.out.println("-----------");
        Color black = new Black();
        BaseShape rectangle = new Rectangle();
        rectangle.setColor(black);
        rectangle.draw();
    }
}
