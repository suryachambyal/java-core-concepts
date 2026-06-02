package J05_ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringDescendingSort {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Kolkata");
        cities.add("Pune");

        System.out.println("Before sorting: " + cities);

        // Custom Comparator for descending order
        Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // descending order
            }
        });

        System.out.println("After sorting (Descending): " + cities);
    }
}
