package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Доступные товары:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
    }
}
