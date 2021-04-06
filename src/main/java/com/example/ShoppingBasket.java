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

}
