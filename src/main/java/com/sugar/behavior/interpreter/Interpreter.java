package com.sugar.behavior.interpreter;

import java.util.Map;

/**
 * @author gshi
 * 功能描述 抽象表达式
 */
public interface Interpreter {

    /**
     * 解释
     *
     * @param variables 参数值
     * @return 返回值
     */
    int interpreter(Map<String, Interpreter> variables);

}
