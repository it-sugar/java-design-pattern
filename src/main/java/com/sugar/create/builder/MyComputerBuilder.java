package com.sugar.create.builder;

/**
 * @author gshi
 * 功能描述 自己的电脑组装程序
 */
public class MyComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public MyComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder setName() {
        this.computer.setName("我自己组装的电脑");
        return this;
    }

    @Override
    public ComputerBuilder addMemory() {
        this.computer.setMemory("京东购入金士顿");
        return this;
    }

    @Override
    public ComputerBuilder addDisk() {
        this.computer.setDisk("淘宝购入希捷硬盘");
        return this;
    }

    @Override
    public ComputerBuilder addCpu() {
        this.computer.setCpu("拼多多购入AMD处理器");
        return this;
    }

    @Override
    public Computer createComputer() {
        return this.computer;
    }
}
