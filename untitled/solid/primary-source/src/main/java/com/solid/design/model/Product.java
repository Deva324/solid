package com.solid.design.model;

import com.solid.design.interface1.Subscription;

public class Product implements Subscription {

    private String name;
    private String description;
    private double subscriptionFee;
    private String type;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setSubscriptionFee(double fee) {
        this.subscriptionFee = fee;
    }

    public double getSubscriptionFee() {
        return this.subscriptionFee;
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

    @Override
    public double monthlySubscriptionFee() {
        return 15;
    }

    @Override
    public double annualSubscriptionFee() {
        return 160;
    }

    @Override
    public double dailySubscriptionFee() {
        return 0.8;
    }

}
