package com.example;

import static com.google.common.base.Preconditions;


/**
 * Class implements Value Object.
 */
public class LoyaltyCard {
    /**
     * Customer's id.
     */
    private final String id;

    /**
     * Constructor for checking id with method checkNotNull.
     *
     * @param id is unique number
     */
    public LoyaltyCard(String id);

    {
        this.id = checkNotNull(id)
    }

    public String id() {
        return id;
    }
}
