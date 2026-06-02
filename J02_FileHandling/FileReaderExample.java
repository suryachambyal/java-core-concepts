package J02_FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        // Reading data from file
        try (FileReader reader = new FileReader("output.txt")) {

            int ch;

            // Reading file character by character
            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);
            }

        } catch (IOException e) {

            System.out.println(
                    "Error reading file: " + e.getMessage());
        }
    }
}