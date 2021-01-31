package com.example;

import com.sun.istack.internal.Nullable;

/**
 * A customer is a person who visits a shop for buying goods.
 *
 * <p>The customer can have a loyalty card.
 *
 * <p>The customer uses the card during a purchase to use bonuses.
 *
 * <p>The absence of a card does not prevent the customer from purchasing the goods.
 */
public final class Customer {
    /**
     * Loyalty card is unique for each customer.
     */
    private final LoyaltyCard card;

    /**
     *
     * <p>The card provides customer with bonuses that can be used to pay for purchases.
     *
     * <p>The customer's card number is unchanged.
     *
     * <p>The card number must be checked.
     *
     * @param card is an additional customer identifier
     */
    public Customer(@Nullable LoyaltyCard card) {
        this.card = checkNotNull(card);
    }
}
