package com.sugar.behavior.interpreter;

import java.util.Map;

/**
 * @author gshi
 * 功能描述 数字解释器
 */
public class NumberInterpreter implements Interpreter {

    private int num;

    public NumberInterpreter(int num) {
        this.num = num;
    }

    public NumberInterpreter(String num) {
        this.num = Integer.parseInt(num);
    }

    @Override
    public int interpreter(Map<String, Interpreter> variables) {
        return this.num;
    }

    @Override
    public String toString() {
        return num + "";
    }
}
