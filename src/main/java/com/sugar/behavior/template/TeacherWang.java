package com.sugar.behavior.template;

/**
 * @author gshi
 * 功能描述 王刚老师
 */
public class TeacherWang extends BaseCook {
    @Override
    public void cleanStuff() {
        System.out.println("帮手帮忙洗菜");
    }

    @Override
    public void handleStuff() {
        System.out.println("宽油...");
        System.out.println("颠勺翻炒...");
        System.out.println("放入适当的材料...");
    }

    @Override
    public void taste() {
        System.out.println("色香味俱全");
    }
}
