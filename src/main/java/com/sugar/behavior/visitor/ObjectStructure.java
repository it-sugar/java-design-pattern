package com.sugar.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gshi
 * 功能描述 对象结构
 */
public class ObjectStructure {

    private List<BaseFile> fileList = new ArrayList<>();

    public boolean addFile(BaseFile baseFile) {
        return this.fileList.add(baseFile);
    }

    public void visitor(Visitor visitor) {
        for (BaseFile baseFile : fileList) {
            baseFile.accept(visitor);
        }
    }
}
