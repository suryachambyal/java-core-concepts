package J04_WrapperClasses;

import java.util.ArrayList;

public class WrapperClasses {

    public static void main(String[] args) {

        // Autoboxing
        int number = 100;
        Integer boxedNumber = number;

        // Unboxing
        Integer value = 50;
        int unboxedValue = value;

        // Wrapper class utility methods
        int parsedNumber = Integer.parseInt("1234");
        double parsedPrice = Double.parseDouble("45.67");
        boolean digitCheck = Character.isDigit('9');

        // Using wrapper classes with collections
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Autoboxed Integer : " + boxedNumber);
        System.out.println("Unboxed int       : " + unboxedValue);
        System.out.println("Parsed Number     : " + parsedNumber);
        System.out.println("Parsed Price      : " + parsedPrice);
        System.out.println("Digit Check       : " + digitCheck);
        System.out.println("ArrayList Values  : " + numbers);
    }
}