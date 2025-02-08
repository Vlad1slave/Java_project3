package org.example;

import java.util.Optional;
import java.util.Scanner;
import java.util.*;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        Cart cart = new Cart();

        store.addProduct(new StoreProduct("Ноутбук", 1000, "Apple"));
        store.addProduct(new StoreProduct("Телефон", 800, "Samsung"));
        store.addProduct(new StoreProduct("Наушники", 200, "Sony"));

        while (true) {
            System.out.println("\n1. Показать товары\n2. Добавить товар в корзину\n3. Показать корзину\n4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> store.listProducts();
                case 2 -> {
                    System.out.println("Введите название товара для добавления:");
                    String name = scanner.nextLine();
                    Optional<Product> product = store.products.stream()
                            .filter(p -> p.getName().equalsIgnoreCase(name))
                            .findFirst();
                    product.ifPresent(cart::addProduct);
                }
                case 3 -> cart.showCart();
                case 4 -> {
                    System.out.println("Выход из магазина.");
                    return;
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}