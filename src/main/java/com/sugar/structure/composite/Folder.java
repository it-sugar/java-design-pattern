package com.sugar.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gshi
 * 功能描述 文件夹类
 */
public class Folder extends BaseFile {

    private List<BaseFile> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("我是一个文件夹，我的名字是" + this.name + ", 我有以下内容：");
        for (BaseFile file : fileList) {
            file.display();
        }
    }

    /**
     * 添加文件到文件夹中
     *
     * @param file 文件或文件夹
     */
    public void add(BaseFile file) {
        this.fileList.add(file);
    }

    /**
     * 删除文件或者文件夹
     *
     * @param file 文件或文件夹
     */
    public void remove(BaseFile file) {
        this.fileList.remove(file);
    }
}
