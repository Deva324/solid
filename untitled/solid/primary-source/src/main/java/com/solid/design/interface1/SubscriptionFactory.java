package com.solid.design.interface1;

public class SubscriptionFactory {
    private SubscriptionFactory() {
    }

    public static SubscriptionFee createSubscriptionFeeInstance(String subscriptionType) {
        switch (subscriptionType) {
            case "month":
                return new MonthSubscriptionFee();
            case "annual":
                return new AnnualSubscriptionFee();
            default:
                return new DailySubscriptionFee();
        }

    }

}
