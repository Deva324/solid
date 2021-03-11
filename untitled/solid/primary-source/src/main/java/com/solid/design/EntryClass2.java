package com.solid.design;

import com.solid.design.model.Product2;
import com.solid.design.app.ProductDB;
import com.solid.design.app.SubscriptionApp;

public class EntryClass2 {
    public static void main(String[] args) {
        ProductDB test2 = new ProductDB();
        Product2 p2 = test2.getProducts().get(0);
        SubscriptionApp t3 = new SubscriptionApp();
        p2.setType("month");
        System.out.println(t3.getProductSubscriptionFee("month"));
        test2.saveProducts(p2);

    }
}
