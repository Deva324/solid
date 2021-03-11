package com.solid.design.app;

import com.solid.design.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductApp {

    public double getProductSubscriptionFee(String type, Product product) {
        switch (type) {
            case "month":
                return product.monthlySubscriptionFee();
            case "annual":
                return product.annualSubscriptionFee();
            default:
                return product.dailySubscriptionFee();
        }

    }

    public List<Product> getProducts() {
        return Arrays.asList(new Product("Product2", "This is testProduct2"), new Product("Product3", "This is testProduct3"));
    }

    public void saveProducts(Product productName) {

    }

}
