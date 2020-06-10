package com.sugar.behavior.iterator;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("你");
        aggregate.add("好");
        aggregate.add("哇");
        final Iterator<String> iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
