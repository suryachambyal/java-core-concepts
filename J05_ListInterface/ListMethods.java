package J05_ListInterface;
import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        // Creating a List
        List<String> fruits = new ArrayList<>();

        // add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After add(): " + fruits);

        // add(index, element)
        fruits.add(1, "Orange");
        System.out.println("After add at index 1: " + fruits);

        // get(index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // set(index, element)
        fruits.set(2, "Grapes");
        System.out.println("After set(): " + fruits);

        // remove(object)
        fruits.remove("Banana");
        System.out.println("After remove(\"Banana\"): " + fruits);

        // remove(index)
        fruits.remove(0);
        System.out.println("After remove at index 0: " + fruits);

        // size()
        System.out.println("Size of list: " + fruits.size());

        // contains(element)
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // indexOf(element)
        System.out.println("Index of Grapes: " + fruits.indexOf("Grapes"));

        // clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Size after clear(): " + fruits.size());

        // isEmpty()
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}
