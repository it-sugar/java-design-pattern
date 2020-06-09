package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 除法策略
 */
public class StrategyDivision implements BaseStrategy {
    @Override
    public int calculate(int first, int second) {
        if (0 == second) {
            throw new IllegalArgumentException("被除数不能为0");
        }
        return first / second;
    }
}
