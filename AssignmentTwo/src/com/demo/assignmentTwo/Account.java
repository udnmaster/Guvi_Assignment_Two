package com.demo.assignmentTwo;

import java.util.Scanner;

class Account {
    private double balance;

    // Constructor without arguments
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

