package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 加法策略
 * @date 2020/6/5 15:36
 */
public class StrategyAdd implements BaseStrategy {
    @Override
    public int calculate(int first, int second) {
        return first + second;
    }
}
