package J05_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class SwappingElements {
    public static void swapElements(List<String> list, int index1, int index2) {
        
        // Store first element in temp variable
        String temp = list.get(index1);
        
        // Replace the first index with second element
        list.set(index1, list.get(index2));

        // Replace second index with temp value
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alpha");
        names.add("Bravo");
        names.add("Charlie");
        names.add("Delta");

        System.out.println("Before swapping: " +names);

        // Swap elements at index 1 and 3
        swapElements(names, 1, 3);

        System.out.println("After swapping: " +names);
    }
}
