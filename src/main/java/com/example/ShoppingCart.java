package com.example;

/**
 * A shopping cart is a thing in which customer puts goods in order to buy it.
 *
 * <p>The customer can choose a cart for his purchases.
 *
 * <p>The absence of a shopping cart does not prevent the customer from purchasing the goods.
 *
 * <p>The customer can change his cart or take another one.
 */
abstract class ShoppingCart {

    /**
     * The shopping cart holds up to 15 items with a total weight of up to 5 kg.
     */
    Goods[] itemsInBasket = new Goods[15];

    /**
     * Before purchasing customer should choose a shopping cart.
     */
    public void chooseShoppingBasket() {
    }

    /**
     * After choosing the cart it have to be taken.
     */
    public void takeShoppingBasket() {
    }

    /**
     * The customer put his goods in the cart.
     */
    public void putTheGoodsIn() {
    }
    /**
     * The goods can be put out of the shopping cart.
     */
    public void putOutTheGoods() {
    }

    /**
     * The cart can be changed to another.
     */
    public void changeShoppingBasket() {
    }

}
