package com.sugar.behavior.iterator;

import java.util.List;

/**
 * @author gshi
 * 功能描述 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list;

    private int index = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        this.index = 0;
        return this.list.get(this.index);
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return this.list.get(this.index++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return this.index < list.size();
    }
}
