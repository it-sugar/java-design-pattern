package com.sugar.create.builder;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder computerBuilder = new DellComputerBuilder();
        Computer computer = director.createComputer(computerBuilder);
        System.out.println(computer.toString());

        System.out.println("------------");

        computerBuilder = new MyComputerBuilder();
        computer = director.createComputer(computerBuilder);
        System.out.println(computer.toString());
    }
}
