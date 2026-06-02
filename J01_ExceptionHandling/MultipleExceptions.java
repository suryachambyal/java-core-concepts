package J01_ExceptionHandling;

import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {

            // Taking index input from user
            System.out.print("Enter an index (0 to 4): ");
            String input = scn.nextLine();

            // May throw NumberFormatException
            int index = Integer.parseInt(input);

            // May throw ArrayIndexOutOfBoundsException
            int value = numbers[index];

            System.out.println("Value at index " + index + " is: " + value);

        } catch (NumberFormatException e) {

            // Handling invalid integer input
            System.out.println("Error: Please enter a valid integer.");

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handling invalid array index
            System.out.println("Error: Index out of range!");

        } catch (Exception e) {

            // Generic backup catch block
            System.out.println("Some other error occurred: " + e.getMessage());

        } finally {

            // finally block always executes
            System.out.println("Closing Scanner...");
            scn.close();
        }

        System.out.println("Program execution completed.");
    }
}