package com.demo.assignmentTwo;
import com.demo.assignmentTwo.Account;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Creating an account with initial balance
        Account account1 = new Account(1000.0);

        // Creating an account without initial balance
        Account account2 = new Account();

        // Deposit some amount to account1
        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount1 = s.nextDouble();
        account1.deposit(depositAmount1);

        // Withdraw some amount from account1
        System.out.print("Enter withdrawal amount for account 1: ");
        double withdrawAmount1 = s.nextDouble();
        account1.withdraw(withdrawAmount1);

        // Deposit some amount to account2
        System.out.print("Enter deposit amount for account 2: ");
        double depositAmount2 = s.nextDouble();
        account2.deposit(depositAmount2);

        // Withdraw some amount from account2
        System.out.print("Enter withdrawal amount for account 2: ");
        double withdrawAmount2 = s.nextDouble();
        account2.withdraw(withdrawAmount2);

        // Display balances of both accounts
        System.out.println("\nBalances:");
        account1.displayBalance();
        account2.displayBalance();

        s.close();
    }
}

