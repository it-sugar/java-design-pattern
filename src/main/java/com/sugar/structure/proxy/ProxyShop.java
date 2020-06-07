package com.sugar.structure.proxy;

/**
 * @author gshi
 * 功能描述 代理店铺
 */
public class ProxyShop implements Shop {

    private static final String RICE = "rice";

    private PhysicalShop physicalShop;

    public ProxyShop() {
        this.physicalShop = new PhysicalShop();
    }

    @Override
    public void buyGoods(String goodsName) {
        if (hasGoodsName(goodsName)) {
            System.out.println("从代理店铺直接购买" + goodsName);
        } else {
            System.out.println("本代理店铺无" + goodsName + "商品，但可以帮您购买！");
            this.physicalShop.buyGoods(goodsName);
        }
    }

    private boolean hasGoodsName(String goodsName) {
        return RICE.equalsIgnoreCase(goodsName);
    }
}
