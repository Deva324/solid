package com.solid.design.model;

import com.solid.design.interface1.Subscription;
import com.solid.design.interface1.SubscriptionFee;

public class Product2 {

    private String name;
    private String description;
    private SubscriptionFee subscriptionFee;
    private String type;

    public Product2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setSubscriptionFee(SubscriptionFee fee) {
        this.subscriptionFee = fee;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setType(String type) {
        this.type = type;
    }
}
