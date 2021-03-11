package com.solid.design;

import com.solid.design.model.Product;
import com.solid.design.app.ProductApp;

public class EntryClass {

    public static void main(String[] args) {
        ProductApp t = new ProductApp();
        Product p = t.getProducts().get(0);
        p.setSubscriptionFee(t.getProductSubscriptionFee("month", p));
        p.setType("month");
        t.saveProducts(p);
    }
}
