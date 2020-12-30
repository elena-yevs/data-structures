package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 * <p>
 * The customer can have a loyalty card that has a specific number.
 */
public final class Customer {
    private final LoyaltyCard card;

    public Customer(LoyaltyCard card) {
        this.card = card;
    }
}
