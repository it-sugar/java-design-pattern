package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        int first = 10;
        int second = 5;
        Context context = new Context(new StrategyAdd());
        System.out.println("StrategyAdd -> " + context.execute(first, second));
        context = new Context(new StrategySubtraction());
        System.out.println("StrategySubtraction -> " + context.execute(first, second));
        context = new Context(new StrategyMultiplication());
        System.out.println("StrategyMultiplication -> " + context.execute(first, second));
        context = new Context(new StrategyDivision());
        System.out.println("StrategyDivision -> " + context.execute(first, second));
    }

}
