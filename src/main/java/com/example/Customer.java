package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 *
 * <p>The customer can have a loyalty card that has a specific number.
 */
public final class Customer {
    /**
     *The customer's loyalty card provides him with bonuses that can be used to pay for purchases.
     *
     * <p>The card number must be entered to receive the bonuses.
     *
     * <p>The absence of a card does not prevent the customer from purchasing the goods.
     */
    private final LoyaltyCard card;

    public Customer(LoyaltyCard card) {
        this.card = card;
    }
}
