package com.sugar.behavior.chainofresponsibility;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        BaseStudent pupilStudent = new PupilStudent();
        BaseStudent highSchoolStudent = new HighSchoolStudent();
        BaseStudent collegeStudent = new CollegeStudent();
        pupilStudent.setNextStudent(highSchoolStudent);
        highSchoolStudent.setNextStudent(collegeStudent);

        pupilStudent.doMath(MathematicalProblem.SIMPLE_MATH);
        System.out.println("----------------");
        pupilStudent.doMath(MathematicalProblem.TRIGONOMETRIC_FUNCTION);
        System.out.println("----------------");
        pupilStudent.doMath(MathematicalProblem.HIGHER_MATHEMATICS);
    }

}
