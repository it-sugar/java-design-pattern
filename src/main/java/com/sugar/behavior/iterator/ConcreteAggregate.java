package com.sugar.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gshi
 * 功能描述 具体聚合对象
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        this.list.add(t);
    }

    @Override
    public void remove(T t) {
        this.list.remove(t);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(this.list);
    }
}
