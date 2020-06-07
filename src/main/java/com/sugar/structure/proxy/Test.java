package com.sugar.structure.proxy;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        Shop shop = new ProxyShop();
        shop.buyGoods("rice");
        shop.buyGoods("vegetables");
    }
}
