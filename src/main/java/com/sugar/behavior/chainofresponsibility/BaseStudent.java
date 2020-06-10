package com.sugar.behavior.chainofresponsibility;

/**
 * @author gshi
 * 功能描述 学生接口
 */
public abstract class BaseStudent {

    protected BaseStudent nextStudent;

    public void setNextStudent(BaseStudent nextStudent) {
        this.nextStudent = nextStudent;
    }

    /**
     * 做数学题
     *
     * @param mathematicalProblem 数学题类型
     */
    public abstract void doMath(MathematicalProblem mathematicalProblem);

}
