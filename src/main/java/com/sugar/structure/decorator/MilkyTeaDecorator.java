package com.sugar.structure.decorator;

/**
 * @author gshi
 * 功能描述 奶茶装饰器
 */
public class MilkyTeaDecorator extends BaseDecorator {
    public MilkyTeaDecorator(Water water) {
        super(water);
        System.out.println("原来的我是" + water.name());
    }

    @Override
    public String name() {
        return "奶茶";
    }

    @Override
    public void introduce() {
        System.out.println("现在的我是一杯奶茶啦");
        super.introduce();
    }

    @Override
    public void taste() {
        water.taste();
        System.out.println("现在我还有奶香和茶香");
    }

    @Override
    public void color() {
        water.color();
        System.out.println("我是奶白色的");
    }

    @Override
    public void function() {
        water.function();
        System.out.println("我很好喝！！");
    }
}
