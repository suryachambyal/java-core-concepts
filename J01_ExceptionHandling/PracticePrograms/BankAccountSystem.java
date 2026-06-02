package J01_ExceptionHandling.PracticePrograms;

import java.util.Scanner;

public class BankAccountSystem {
    public static void createAccount(String name, double initialDeposit) throws IllegalArgumentException {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty!");
        }
        if(initialDeposit < 1000) {
            throw new IllegalArgumentException("Initial deposit cannot be less than 1000");
        }
        System.out.println("Account created successfully for "+name+ " with balance "+initialDeposit);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Enter account holder name: ");
            String name = scn.nextLine();
            System.out.print("Enter account holder initial deposit amount: ");
            double initialDeposit = scn.nextDouble();
            createAccount(name,initialDeposit);
        } catch (IllegalArgumentException e) {
            System.out.println("Account creation failed: "+e.getMessage());
        } finally{
            System.out.println("Bank portal session closed.");
            scn.close();
        }
    }
}
