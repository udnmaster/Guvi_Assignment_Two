package com.demo.assignmentTwo;

import com.demo.assignmentTwo.Product;
import java.util.*;

public class Xyz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("PID: ");
            int pid = s.nextInt();
            System.out.print("Price: ");
            double price = s.nextDouble();
            System.out.print("Quantity: ");
            int quantity = s.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find PID of the product with the highest price
        int maxPricePid = findPidOfMaxPriceProduct(products);
        System.out.println("PID of product with the highest price: " + maxPricePid);

        // Calculate and print the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
    }

    private static int findPidOfMaxPriceProduct(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int maxPricePid = -1;
        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }
        return maxPricePid;
    }

    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}
