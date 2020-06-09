package com.sugar.behavior.template;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        BaseCook cook = new TeacherWang();
        cook.cook();
        System.out.println("--------------");
        cook = new NormalCook();
        cook.cook();
    }

}
