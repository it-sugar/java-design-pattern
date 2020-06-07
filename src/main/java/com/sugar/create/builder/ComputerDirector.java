package com.sugar.create.builder;

/**
 * @author gshi
 * 功能描述 用来调用建造者完成创建，不涉及具体产品信息
 */
public class ComputerDirector {

    public Computer createComputer(ComputerBuilder computerBuilder) {
        return computerBuilder.setName()
                .addCpu()
                .addMemory()
                .addDisk()
                .createComputer();
    }
}
