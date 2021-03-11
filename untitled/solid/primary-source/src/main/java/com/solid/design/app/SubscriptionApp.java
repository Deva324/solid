package com.solid.design.app;

import com.solid.design.interface1.SubscriptionFactory;

public class SubscriptionApp {

    public double getProductSubscriptionFee(String type) {
       return SubscriptionFactory.createSubscriptionFeeInstance(type).getSubscriptionFee();
    }
}
