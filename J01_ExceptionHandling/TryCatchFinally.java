package J01_ExceptionHandling;

import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner scn = new Scanner(System.in);

        try {

            // Taking numerator input
            System.out.print("Enter the numerator: ");
            int num = scn.nextInt();

            // Taking denominator input
            System.out.print("Enter the denominator: ");
            int den = scn.nextInt();

            // May throw ArithmeticException if denominator is 0
            int result = num / den;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handling divide by zero exception
            System.out.println("Error: Cannot divide by zero!");

        } finally {

            // finally block always executes
            System.out.println("Closing Scanner and ending program...");
            scn.close();
        }

        System.out.println("Main method execution completed.");
    }
}