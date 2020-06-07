package com.sugar.structure.proxy;

/**
 * @author gshi
 * 功能描述 实体店
 */
public class PhysicalShop implements Shop {

    @Override
    public void buyGoods(String goodsName) {
        System.out.println("在实体店购买物品" + goodsName);
    }
}
