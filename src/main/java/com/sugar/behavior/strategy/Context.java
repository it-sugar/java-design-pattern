package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 策略运行环境
 */
public class Context {

    private BaseStrategy strategy;

    public Context(BaseStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int first, int second) {
        return strategy.calculate(first, second);
    }
}
