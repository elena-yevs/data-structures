package com.example;
import com.google.common.base.Preconditions;



public class LoyaltyCard {
    private final String id;

     public LoyaltyCard(String id);

    {
        this.id = checkNotNull(id);
    }

    public String value() {
        return id;
    }
}
