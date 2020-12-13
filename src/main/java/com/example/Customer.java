package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 * The customer can have a loyaltyCard that has a specific number.
 */

public final class Customer {

    private final String loyaltyCard;

    /**
     * Constructor for determination the customer's loyaltyCard number.
     *
     * @param loyaltyCard String value
     */
    public Customer(String loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
