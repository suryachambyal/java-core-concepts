package J01_ExceptionHandling.PracticePrograms;

import java.util.Scanner;

public class UserRegistrationSystem {

    // Method for registering user
    public static void registerUser(String username, int age)
            throws IllegalArgumentException {

        // Checking empty username
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Username cannot be empty!");
        }

        // Checking minimum age requirement
        if (age < 13) {
            throw new IllegalArgumentException(
                    "User must be 13 or older to register.");
        }

        System.out.println("User registered successfully!");
    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        try {

            // Taking username input
            System.out.print("Enter your username: ");
            String username = scn.nextLine();

            // Taking age input
            System.out.print("Enter your age: ");
            int age = scn.nextInt();

            // Calling registration method
            registerUser(username, age);

        } catch (IllegalArgumentException e) {

            // Handling registration-related exceptions
            System.out.println(
                    "Application failed: " + e.getMessage());

        } finally {

            // finally block always executes
            System.out.println("Registration process completed.");
            scn.close();
        }
    }
}