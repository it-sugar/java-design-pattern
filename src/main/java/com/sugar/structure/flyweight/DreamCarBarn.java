package com.sugar.structure.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gshi
 * 功能描述 梦想中的车库
 */
public class DreamCarBarn {
    /**
     * 宝马汽车
     */
    public static final String BMW_CAR = "BMW";
    /**
     * 福特汽车
     */
    public static final String FORD_CAR = "FORD";
    /**
     * 丰田汽车
     */
    public static final String TOYOTA_CAR = "TOYOTA";

    private static final DreamCarBarn CAR_BARN = new DreamCarBarn();

    private static final ConcurrentHashMap<String, BaseCar> CAR_MAP = new ConcurrentHashMap<>();

    public static DreamCarBarn getInstance() {
        return CAR_BARN;
    }

    public BaseCar getCar(String brand) {
        if (null == brand) {
            throw new IllegalArgumentException("请传入汽车品牌");
        }
        if (CAR_MAP.containsKey(brand)) {
            System.out.println("车库中已经有" + brand + "品牌的汽车了，可以直接使用~");
            return CAR_MAP.get(brand);
        }
        BaseCar car;
        switch (brand) {
            case BMW_CAR:
                car = new BmwCar();
                CAR_MAP.putIfAbsent(BMW_CAR, car);
                break;
            case FORD_CAR:
                car = new FordCar();
                CAR_MAP.putIfAbsent(FORD_CAR, car);
                break;
            case TOYOTA_CAR:
                car = new ToyotaCar();
                CAR_MAP.putIfAbsent(TOYOTA_CAR, car);
                break;
            default:
                throw new IllegalArgumentException("暂不支持其他车型！");
        }
        System.out.println("车库中没有指定品牌车，已经帮您新购入一辆" + brand + "品牌汽车~");
        return car;
    }
}
