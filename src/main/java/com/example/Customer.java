package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 *
 * The customer can have a loyaltyCard that has a specific number.
 */
public final class Customer {

    private final LoyaltyCard loyaltyCard;

    /**
     * Constructor for determination the customer's loyalty card number.
     *
     * @param loyaltyCard
     */
    public Customer(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
