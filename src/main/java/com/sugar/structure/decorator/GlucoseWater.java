package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 葡萄糖水
 */
public class GlucoseWater extends BaseDecorator {

    public GlucoseWater(Water water) {
        super(water);
        System.out.println("原来的我是" + water.name());
    }

    @Override
    public String name() {
        return "葡萄糖水";
    }

    @Override
    public void introduce() {
        System.out.println("我现在是一杯葡萄糖水啦");
        super.introduce();
    }

    @Override
    public void taste() {
        water.taste();
        System.out.println("我是甜的");
    }

    @Override
    public void function() {
        water.function();
        System.out.println("我可以补充葡萄糖");
    }
}
