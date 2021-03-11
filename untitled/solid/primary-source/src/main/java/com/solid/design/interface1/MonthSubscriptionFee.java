package com.solid.design.interface1;

public class MonthSubscriptionFee implements SubscriptionFee {

    @Override
    public double getSubscriptionFee() {
        return 15;
    }
}
