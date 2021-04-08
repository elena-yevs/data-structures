package com.example;

/**
 * A shopping trolley is a thing in which customer puts goods in order to buy it.
 *
 * <p>The shopping trolley is suitable for more goods than the shopping basket.
 *
 * <p>The absence of a shopping trolley does not prevent the customer from purchasing the goods.
 *
 * <p>The customer can change his trolley or take another one.
 */
abstract class ShoppingTrolley implements ShoppingCart{
    /**
     * The customer uses shopping trolley.
     */
    public Customer customer;

    /**
     * The shopping trolley holds up to 30 items with a total weight of up to 20 kg.
     */
    Goods itemsInTrolley[]=new Goods [30];
}
