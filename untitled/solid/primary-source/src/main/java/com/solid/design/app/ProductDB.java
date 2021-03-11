package com.solid.design.app;

import com.solid.design.model.Product2;

import java.util.Arrays;
import java.util.List;

public class ProductDB {

    public List<Product2> getProducts() {
        return Arrays.asList(new Product2("Product2", "This is testProduct2"), new Product2("Product3", "This is testProduct3"));
    }

    public void saveProducts(Product2 productName) {

    }
}
