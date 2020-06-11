package com.sugar.behavior.interpreter;

import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @author gshi
 * 功能描述 操作环境
 */
public class Evaluator implements Interpreter {

    private static final Pattern NUM_PATTERN = Pattern.compile("^[0-9]*$");

    private Interpreter interpreter;

    /**
     * 解析表达式
     * 注意减法和除法有操作顺序
     *
     * @param expression 表达式
     */
    public Evaluator(String expression) {
        Stack<Interpreter> expressionStack = new Stack<>();
        final String[] strings = expression.split(" ");
        for (String value : strings) {
            if ("+".equals(value)) {
                Interpreter add = new AddInterpreter(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(add);
            } else if ("-".equals(value)) {
                Interpreter rightInterpreter = expressionStack.pop();
                Interpreter leftInterpreter = expressionStack.pop();
                Interpreter subtraction = new SubtractionInterpreter(leftInterpreter, rightInterpreter);
                expressionStack.push(subtraction);
            } else if ("*".equals(value)) {
                Interpreter multi = new MultiInterpreter(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(multi);
            } else if ("/".equals(value)) {
                Interpreter rightInterpreter = expressionStack.pop();
                Interpreter leftInterpreter = expressionStack.pop();
                Interpreter division = new DivisionInterpreter(leftInterpreter, rightInterpreter);
                expressionStack.push(division);
            } else if (isNum(value)) {
                expressionStack.push(new NumberInterpreter(value));
            } else {
                expressionStack.push(new VariableInterpreter(value));
            }
        }
        interpreter = expressionStack.pop();
    }

    @Override
    public int interpreter(Map<String, Interpreter> variables) {
        return interpreter.interpreter(variables);
    }

    /**
     * 判断字符串是不是常量
     *
     * @param str 输入字符串
     * @return 是否可以转换为数字
     */
    private boolean isNum(String str) {
        return NUM_PATTERN.matcher(str).matches();
    }
}
