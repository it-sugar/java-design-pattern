package com.sugar.structure.adapter;

/**
 * @author gshi
 * 功能描述 类的适配器
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void targetMethod() {
        adapteeMethod();
    }
}
