package com.example;

/**
 * A customer is a person who visits a shop for buying goods.
 *
 * <p>The customer can have a loyalty card that has a specific number.
 */
public final class Customer {
    /**
     * In order to use previously collected bonuses, the customer uses the card during a purchase.
     *
     * <p>The absence of a card does not prevent the customer from purchasing the goods.
     */
    private final LoyaltyCard card;

    /**
     * Loyalty card is assigned to a specific customer.
     *
     * <p>The card provides customer with bonuses that can be used to pay for purchases.
     *
     * <p>The customer's card number is unchanged.
     *
     * @param card is an additional customer identifier.
     */
    public Customer(LoyaltyCard card) {
        this.card = card;
    }
}
