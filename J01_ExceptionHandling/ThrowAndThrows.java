package J01_ExceptionHandling;

import java.util.Scanner;

public class ThrowAndThrows {

    // Method declaring exception using throws
    public static void applyForLicense(int age) throws IllegalArgumentException {

        // Checking negative age
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }

        // Manually throwing exception if age is below 18
        if (age < 18) {
            throw new IllegalArgumentException(
                    "You must be 18 or above to apply for a driving license.");
        }

        // If age is valid
        System.out.println("License application submitted successfully!");
    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        try {

            // Taking user input
            System.out.print("Enter your age: ");
            int userAge = scn.nextInt();

            // Calling method that may throw exception
            applyForLicense(userAge);

        } catch (IllegalArgumentException e) {

            // Handling invalid age exception
            System.out.println("Application Failed: " + e.getMessage());

        } finally {

            // finally block always executes
            System.out.println("Thank you for using our Driving License Portal.");
            scn.close();
        }
    }
}