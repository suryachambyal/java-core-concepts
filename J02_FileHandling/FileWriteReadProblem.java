package J02_FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReadProblem {

    public static void main(String[] args) {

        // Writing content into file
        try (FileWriter writer = new FileWriter("analysis.txt")) {

            writer.write(
                    "The task ahead of you is never greater than the strength within you.\n");

            writer.write(
                    "The oak fought the wind and was broken, the willow bent when it must and survived.\n");

            writer.write(
                    "You never know how strong you are, until being strong is your only choice.\n");

            System.out.println("File written successfully!");

        } catch (IOException e) {

            System.out.println(
                    "An error occurred: " + e.getMessage());
        }

        // Reading and analyzing file
        try (FileReader reader = new FileReader("analysis.txt")) {

            int ch;
            int characters = 0;
            int lines = 1;

            // Reading file character by character
            while ((ch = reader.read()) != -1) {

                characters++;

                if (ch == '\n') {
                    lines++;
                }
            }

            // Displaying results
            System.out.println("Characters: " + characters);
            System.out.println("Lines: " + lines);

        } catch (IOException e) {

            System.out.println(
                    "Error while reading file: "
                            + e.getMessage());
        }
    }
}