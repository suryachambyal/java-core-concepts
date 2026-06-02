package J01_ExceptionHandling.PracticePrograms;

import java.util.Scanner;

public class ATMWithdrawalSystem {

    // Method for withdrawing amount
    public static void withdrawAmount(double balance, double amount)
            throws IllegalArgumentException {

        // Daily withdrawal limit
        final int DAILY_LIMIT = 20000;

        // Calculating remaining balance
        double remainingBalance = balance - amount;

        // Checking invalid withdrawal amount
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than zero!");
        }

        // Checking insufficient balance
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance! Available balance: " + balance);
        }

        // Checking daily withdrawal limit
        if (amount > DAILY_LIMIT) {
            throw new IllegalArgumentException(
                    "Withdrawal amount exceeds daily limit of 20000");
        }

        System.out.println(
                "Withdrawal successful! Remaining balance: " + remainingBalance);
    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        try {

            // Taking current balance input
            System.out.print("Enter your current balance: ");
            double balance = scn.nextDouble();

            // Taking withdrawal amount input
            System.out.print("Enter amount to withdraw: ");
            double amount = scn.nextDouble();

            // Calling withdrawal method
            withdrawAmount(balance, amount);

        } catch (IllegalArgumentException e) {

            // Handling withdrawal-related exceptions
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {

            // finally block always executes
            System.out.println("Thank you for using the ATM.");
            scn.close();
        }
    }
}