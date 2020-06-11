package com.sugar.behavior.interpreter;

import java.util.Map;

/**
 * @author gshi
 * 功能描述 减法解释器
 */
public class SubtractionInterpreter implements Interpreter {

    private Interpreter firstExpression;

    private Interpreter secondExpression;

    public SubtractionInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter(Map<String, Interpreter> variables) {
        return firstExpression.interpreter(variables) - secondExpression.interpreter(variables);
    }
}
