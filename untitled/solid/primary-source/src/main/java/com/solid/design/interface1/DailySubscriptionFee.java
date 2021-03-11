package com.solid.design.interface1;

public class DailySubscriptionFee implements SubscriptionFee {

    @Override
    public double getSubscriptionFee() {
        return 0.8;
    }
}
