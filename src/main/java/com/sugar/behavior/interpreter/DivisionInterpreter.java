package com.sugar.behavior.interpreter;

import java.util.Map;

/**
 * @author gshi
 * 功能描述 除法解释器
 */
public class DivisionInterpreter implements Interpreter {

    private Interpreter firstExpression;

    private Interpreter secondExpression;

    public DivisionInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter(Map<String, Interpreter> variables) {
        final int num = secondExpression.interpreter(variables);
        if (0 == num) {
            throw new IllegalArgumentException("被除数为0！");
        }
        return firstExpression.interpreter(variables) / num;
    }
}
