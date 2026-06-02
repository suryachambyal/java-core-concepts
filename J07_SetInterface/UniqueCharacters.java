package J07_SetInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {

    public static void main(String[] args) {

        Set<Character> uniqueCharacters = new HashSet<>();

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        for (char ch : input.toCharArray()) {
            uniqueCharacters.add(ch);
        }

        System.out.println("Number of unique characters: " + uniqueCharacters.size());

        scn.close();
    }
}