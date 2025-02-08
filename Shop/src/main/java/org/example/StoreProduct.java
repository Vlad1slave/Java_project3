package org.example;

public class StoreProduct implements Product {
    private final String name;
    private final double price;
    private final String manufacturer;

    public StoreProduct(String name, double price, String manufacturer) {
            this.name = name;
            this.price = price;
            this.manufacturer = manufacturer;
    }

    @Override
        public String getName() {
            return name;
    }

    @Override
        public double getPrice() {
            return price;
    }

    @Override
        public String getManufacturer() {
            return manufacturer;
    }

    @Override
        public String toString() {
            return name + " - " + price + " USD (" + manufacturer + ")";
    }
}

