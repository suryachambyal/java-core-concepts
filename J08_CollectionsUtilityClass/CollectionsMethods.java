package J08_CollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {

        // Collections Utility Class Methods Demonstration
        // Collections provides useful static methods for
        // sorting, reversing, shuffling, searching, and more.

        List<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Original List: " + numbers);

        // sort() - sorts elements in ascending order
        Collections.sort(numbers);
        System.out.println("After sort(): " + numbers);

        // reverse() - reverses the order of elements
        Collections.reverse(numbers);
        System.out.println("After reverse(): " + numbers);

        // shuffle() - randomly rearranges elements
        Collections.shuffle(numbers);
        System.out.println("After shuffle(): " + numbers);

        // min() - returns the smallest element
        System.out.println("Minimum Element: " + Collections.min(numbers));

        // max() - returns the largest element
        System.out.println("Maximum Element: " + Collections.max(numbers));

        // frequency() - counts occurrences of an element
        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20));
    }
}