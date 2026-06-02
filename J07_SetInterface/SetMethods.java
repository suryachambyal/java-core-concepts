package J07_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        // add() - adds element
        names.add("James");
        names.add("Henry");
        names.add("Liam");
        names.add("Mike");
        names.add("Oliver");

        // duplicate element (ignored)
        names.add("James");

        // HashSet does not maintain insertion order
        System.out.println("Initial Set: " + names);  
        
        // size() - number of elements
        System.out.println("Size of set: " + names.size());

        // contains() - checks if element exists
        System.out.println("Contains Liam? " + names.contains("Liam"));
        System.out.println("Contains Noah? " + names.contains("Noah"));

        // remove() - removes element
        names.remove("Mike");
        System.out.println("After remove(\"Mike\"): " + names);

        // isEmpty() - checks if set is empty
        System.out.println("Is set empty? " + names.isEmpty());

        // clear() - removes all elements
        names.clear();
        System.out.println("After clear(): " + names);

        // size after clear
        System.out.println("Size after clear(): " + names.size());

        // isEmpty after clear
        System.out.println("Is set empty after clear()? " + names.isEmpty());
    }
}
