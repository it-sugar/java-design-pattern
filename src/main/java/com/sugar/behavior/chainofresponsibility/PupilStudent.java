package com.sugar.behavior.chainofresponsibility;

/**
 * @author gshi
 * 功能描述 小学生
 */
public class PupilStudent extends BaseStudent {

    @Override
    public void doMath(MathematicalProblem mathematicalProblem) {
        if (MathematicalProblem.SIMPLE_MATH == mathematicalProblem) {
            System.out.println("我是小学生，我可以解决" + mathematicalProblem.getName());
        } else {
            if (null == this.nextStudent) {
                System.out.println("现在我还无法解决" + mathematicalProblem.getName());
            } else {
                System.out.println("我是小学生，我准备请求协助！");
                this.nextStudent.doMath(mathematicalProblem);
            }
        }
    }
}
