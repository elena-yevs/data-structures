package com.example;

import static com.google.common.base.Preconditions;


/**
 * The card is unique to each customer.
 */
public final class LoyaltyCard {
    /**
     * Number is the card's id.
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

