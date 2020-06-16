package ru.job4j.array;

public class Shop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index < products.length; index++) {
            Product pr = products[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
        System.out.println();
        Product[] products1 = delete(products, 0);
        for (int index = 0; index < products.length; index++) {
            Product pr = products[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
