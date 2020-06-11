package com.sugar.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gshi
 * 功能描述 解析逆波兰表达式并进行逻辑计算
 * 计算表达式用空格分开
 */
public class Test {

    public static void main(String[] args) {
        String expression = "a b + 3 * a b - 2 / -";
        Evaluator evaluator = new Evaluator(expression);
        Map<String, Interpreter> variables = new HashMap<>(4);
        variables.put("a", new NumberInterpreter(4));
        variables.put("b", new NumberInterpreter(2));
        int result = evaluator.interpreter(variables);
        System.out.println(result);
    }
}
