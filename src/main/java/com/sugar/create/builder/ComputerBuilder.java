package com.sugar.create.builder;

/**
 * @author gshi
 * 功能描述 构建电脑，用以规范产品对象各个组成成分的建造
 */
public interface ComputerBuilder {

    /**
     * 设置名称
     *
     * @return 构建者对象
     */
    ComputerBuilder setName();

    /**
     * 添加内存
     *
     * @return 构建者对象
     */
    ComputerBuilder addMemory();

    /**
     * 添加磁盘
     *
     * @return 构建者对象
     */
    ComputerBuilder addDisk();

    /**
     * 添加CPU
     *
     * @return 构建者对象
     */
    ComputerBuilder addCpu();

    /**
     * 构建电脑
     *
     * @return 构建出来的电脑对象
     */
    Computer createComputer();
}
