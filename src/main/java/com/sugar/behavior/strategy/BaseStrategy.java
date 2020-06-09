package com.sugar.behavior.strategy;

/**
 * @author gshi
 * 功能描述 策略接口
 */
public interface BaseStrategy {

    /**
     * 进行计算
     *
     * @param first  第一个参数
     * @param second 第二个参数
     * @return 计算结果
     */
    int calculate(int first, int second);
}
