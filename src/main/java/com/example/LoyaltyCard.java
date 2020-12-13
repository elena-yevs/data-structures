package com.example;
import static com.google.common.base.Preconditions;


/**
 * Class implements Value Object
 */
public class LoyaltyCard {
    /**
     * Customer's card id
     */
    private final String id;

    /**
     *Constructor
     * @param id is verified by checkNotNull
     */
     public LoyaltyCard(String id);

    {
        this.id = checkNotNull(id);
    }

    /**
     * Method returns customer's card id
     */
    public String id() {
        return id;
    }
}
