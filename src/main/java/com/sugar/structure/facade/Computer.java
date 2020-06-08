package com.sugar.structure.facade;

/**
 * @author gshi
 * 功能描述 电脑类
 */
public class Computer {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void startUp() {
        this.disk.startUp();
        this.memory.startUp();
        this.cpu.startUp();
    }

    public void shutdown() {
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
    }
}
