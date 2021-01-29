package com.example;

import static com.google.common.base.Preconditions;


/**
 * Each customer has his own card that serves as an additional identifier.
 */
public final class LoyaltyCard {
    /**
     * Customer's card id.
     */
    private final String number;

    /**
     * Constructor creates a new card with the passed number.
     *
     * <p>Checking the card number.
     *
     * @param number a unique card number, consisting of digital characters
     */
    public LoyaltyCard(CharSequence number) {
        this.number = checkNotNull(number);
        this.number = number;
    }

    /**
     * Method to get the card id if the customer provides a card or its number.
     *
     * @return unique card number
     */
    public String id() {
        return number;
    }
}

