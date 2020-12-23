package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 * <p>
 * The customer can have a loyaltyCard that has a specific number.
 */
public final class Customer {

    private final LoyaltyCard loyaltyCard;

    /**
     * Constructor for determination the number of customer's loyalty сard.
     *
     * @param loyaltyCard
     */
    public Customer(LoyaltyCard loyaltyCard) {

        this.loyaltyCard = loyaltyCard;
    }
}
