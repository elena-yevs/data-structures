package com.example;
import static com.google.common.base.Preconditions;


/**
 * Each customer has his own card that serves as an identifier.
 */
public class LoyaltyCard {
    /**
     * Customer's card id.
     */
    private final String number;

    /**
     * Constructor creates a new card with the passed number.
     *
     * @param number a card number that is unique, must be a sequence of a certain number of digital characters
     */
    public LoyaltyCard(CharSequence number) {
        this.number = checkNotNull(number);
        this.number = number;
    }

    public String id() {
        return number;
    }
}

