package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        // this method loads product objects into inventory
        // and its details are not shown
        Product product1 = new Product(4567, "10' 2x4 (grade B)", 9.99f);
        Product product2 = new Product(1234, "Hammer" , 19.49f);
        Product product3 = new Product(2345, "Box of nails" ,9.29f);

        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        return inventory;
    }
}










