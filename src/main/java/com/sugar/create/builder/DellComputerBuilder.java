package com.sugar.create.builder;

/**
 * @author gshi
 * 功能描述 针对Compulter接口具体执行对象各部分的创建。
 */
public class DellComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public DellComputerBuilder() {
        this.computer = new Computer();
    }


    @Override
    public ComputerBuilder setName() {
        this.computer.setName("戴尔电脑");
        return this;
    }

    @Override
    public ComputerBuilder addMemory() {
        this.computer.setMemory("三星内存");
        return this;
    }

    @Override
    public ComputerBuilder addDisk() {
        this.computer.setDisk("西部数据硬盘");
        return this;
    }

    @Override
    public ComputerBuilder addCpu() {
        this.computer.setCpu("Intel处理器");
        return this;
    }

    @Override
    public Computer createComputer() {
        return this.computer;
    }
}
