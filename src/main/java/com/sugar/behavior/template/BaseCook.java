package com.sugar.behavior.template;

/**
 * @author gshi
 * 功能描述 学做菜
 */
public abstract class BaseCook {

    public void cook() {
        buyStuff();
        cleanStuff();
        handleStuff();
        finish();
        taste();
    }

    public void buyStuff() {
        System.out.println("所有要做饭的人都需要先买菜");
    }

    /**
     * 清理购买的菜
     */
    public abstract void cleanStuff();

    /**
     * 开始做菜了
     */
    public abstract void handleStuff();

    /**
     * 结束本次做菜
     */
    public void finish() {
        System.out.println("做菜结束，开始刷洗");
    }

    /**
     * 味道怎么样
     */
    public abstract void taste();

}
