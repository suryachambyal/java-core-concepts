package J02_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        // Writing data in overwrite mode
        try (FileWriter writer = new FileWriter("output.txt")) {

            writer.write("Hello, this is my first file!\n");
            writer.write("I am writing in this file using FileWriter in Java.");

            System.out.println("File writing successful!");

        } catch (IOException e) {

            System.out.println(
                    "An error occurred: " + e.getMessage());
        }

        // Writing data in append mode
        try (FileWriter writer = new FileWriter("output.txt", true)) {

            writer.write("\nThis is new content added later!");
            writer.write("\nAppending more text using FileWriter.");

            System.out.println("Append write successful!");

        } catch (IOException e) {

            System.out.println(
                    "An error occurred while appending: "
                            + e.getMessage());
        }
    }
}

