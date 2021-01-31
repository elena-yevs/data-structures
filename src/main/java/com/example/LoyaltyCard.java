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
     * Creating a new card with the passed number.
     *
     * <p>Card number consists of a fixed number of characters.
     *
     * <p>Checking the card number for characters.
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

