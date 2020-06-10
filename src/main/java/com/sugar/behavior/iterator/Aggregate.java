package com.sugar.behavior.iterator;

/**
 * @author gshi
 * 功能描述 抽象聚合
 */
public interface Aggregate<T> {
    /**
     * 添加对象
     *
     * @param t 待添加对象
     */
    void add(T t);

    /**
     * 移除对象
     *
     * @param t 待移除对象
     */
    void remove(T t);

    /**
     * 获得迭代器对象
     *
     * @return 迭代器对象
     */
    Iterator<T> getIterator();
}
