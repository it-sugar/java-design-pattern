package com.sugar.behavior.iterator;

/**
 * @author gshi
 * 功能描述 迭代器抽象对象
 */
public interface Iterator<T> {

    /**
     * 获取第一个值
     *
     * @return 第一个值
     */
    T first();

    /**
     * 获取下一个值
     *
     * @return 下一个值
     */
    T next();

    /**
     * hasNext
     *
     * @return 是否有下一个
     */
    boolean hasNext();
}
