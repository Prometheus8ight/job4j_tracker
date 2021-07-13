package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index == products.length - 1) {
            products[products.length - 1] = null;
            return products;
        }
        for (int i = 0; i < products.length - 1; i++) {
            if (i == index) {
                for (int j = i; j < products.length - 1; j++) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
                products[products.length - 1] = null;
                return products;
            }
        }
        return products;
    }
}
