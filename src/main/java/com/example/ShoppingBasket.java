package com.example;

/**
 * A shopping basket is a thing in which customer puts goods in order to buy it.
 *
 * <p>The customer can choose a basket suitable for his purchases.
 *
 * <p>The absence of a shopping basket does not prevent the customer from purchasing the goods.
 *
 * <p>The customer can change his basket or take another one.
 */
abstract class ShoppingBasket implements ShoppingCart {
    /**
     * The customer uses shopping basket.
     */
    public Customer customer;

    /**
     * Before purchasing customer should choose a suitable for his purchases shopping basket.
     */
    public void choose() {
    }

    /**
     * After choosing the basket it have to be taken.
     */
    public void take() {
    }

    /**
     * The customer put his goods in the basket.
     */
    public void put() {
    }

    /**
     * The goods can be put out of the shopping basket.
     */
    public void putOut() {
    }

    /**
     * The basket can be changed to a more suitable one.
     */
    public void change() {
    }

}
