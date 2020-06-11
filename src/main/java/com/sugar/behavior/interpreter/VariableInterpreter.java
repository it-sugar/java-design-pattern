package com.sugar.behavior.interpreter;

import java.util.Map;

/**
 * @author gshi
 * 功能描述 变量解释器
 */
public class VariableInterpreter implements Interpreter {

    private String variable;

    public VariableInterpreter(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpreter(Map<String, Interpreter> variables) {
        if (!variables.containsKey(variable)) {
            throw new IllegalArgumentException("未找到参数" + variable);
        }
        return variables.get(variable).interpreter(variables);
    }
}
