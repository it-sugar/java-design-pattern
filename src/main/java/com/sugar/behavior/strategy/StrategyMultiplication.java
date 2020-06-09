package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 乘法策略
 */
public class StrategyMultiplication implements BaseStrategy {
    @Override
    public int calculate(int first, int second) {
        return first * second;
    }
}
