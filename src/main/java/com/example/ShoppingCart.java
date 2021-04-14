package com.example;

/**
 * A shopping basket is a thing in which customer puts goods in order to buy it.
 *
 * <p>The customer can choose a basket for his purchases.
 *
 * <p>The absence of a shopping basket does not prevent the customer from purchasing the goods.
 *
 * <p>The customer can change his basket or take another one.
 */
abstract class ShoppingCart {
    /**
     * The customer uses shopping basket.
     */
    private Customer customer;

    /**
     * The shopping basket holds up to 15 items with a total weight of up to 5 kg.
     */
    Goods[] itemsInBasket = new Goods[15];

    /**
     * Before purchasing customer should choose a shopping basket.
     */
    public void chooseShoppingBasket() {
    }

    /**
     * After choosing the basket it have to be taken.
     */
    public void takeShoppingBasket() {
    }

    /**
     * The customer put his goods in the basket.
     */
    public void putTheGoodsIn() {
    }
    /**
     * The goods can be put out of the shopping basket.
     */
    public void putOutTheGoods() {
    }

    /**
     * The basket can be changed to another.
     */
    public void changeShoppingBasket() {
    }

}
