package J05_ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        primeNumbers.add(19);
        primeNumbers.add(23);
        primeNumbers.add(29);

        System.out.println("Before reversing: " +primeNumbers);
        Collections.reverse(primeNumbers);
        System.out.print("After reversing: " +primeNumbers);
    }
    
}
