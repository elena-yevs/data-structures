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
     * @param number is unique for each card.
     */
    public LoyaltyCard(String number) {
        this.number = checkNotNull(number);
    }


    public String id() {
        return number;
    }
}
