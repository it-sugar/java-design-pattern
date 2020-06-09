package com.sugar.behavior.template;

/**
 * @author gshi
 * 功能描述 正常人做菜
 */
public class NormalCook extends BaseCook {

    @Override
    public void cleanStuff() {
        System.out.println("洗菜也很费劲");
    }

    @Override
    public void handleStuff() {
        System.out.println("掌握不好倒多少油");
        System.out.println("掌握不好翻炒技巧");
        System.out.println("掌握不好放多少调料");
    }

    @Override
    public void taste() {
        System.out.println("味道一般");
    }
}
