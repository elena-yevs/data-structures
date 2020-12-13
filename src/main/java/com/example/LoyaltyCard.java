package com.example;
//import com.google.common.base.Preconditions;

import java.util.concurrent.ArrayBlockingQueue;

public class LoyaltyCard {
    private final String id;

     public LoyaltyCard(String id);

    {
        this.id = ArrayBlockingQueue.checkNotNull(id);
    }

    public String value() {
        return id;
    }
}
