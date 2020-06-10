package com.sugar.behavior.chainofresponsibility;

/**
 * @author gshi
 * 功能描述 高中生
 */
public class HighSchoolStudent extends BaseStudent {

    @Override
    public void doMath(MathematicalProblem mathematicalProblem) {
        if (MathematicalProblem.SIMPLE_MATH == mathematicalProblem
                || MathematicalProblem.TRIGONOMETRIC_FUNCTION == mathematicalProblem) {
            System.out.println("我是高中生，我可以解决" + mathematicalProblem.getName());
        } else {
            if (null == this.nextStudent) {
                System.out.println("我是高中生，我目前还无法解决" + mathematicalProblem.getName());
            } else {
                System.out.println("我是高中生，我准备请求协助！");
                this.nextStudent.doMath(mathematicalProblem);
            }
        }
    }
}
