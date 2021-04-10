package com.example;

import static com.google.common.base.Preconditions;


/**
 * The card is unique to a network of shops.
 */
public final class LoyaltyCard {
    /**
     * Number is a card identifier.
     */
    private final String number;

    /**
     * Creates a new card with the passed number.
     *
     * <p>Card number consists of a fixed number of characters.
     *
     * <p>Checks the card number for characters.
     *
     * @param number must differ by at least one character
     */
    public LoyaltyCard(CharSequence number) {
        this.number = checkNotNull(number);
        this.number = number;
    }

    /**
     * Getting the card number.
     *
     * @return unique card number
     */
    public String number() {
        return number;
    }
}

