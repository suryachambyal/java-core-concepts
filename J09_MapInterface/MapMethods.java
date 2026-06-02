package J09_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // Creating a Map (Roll Number -> Student Name)
        Map<Integer, String> students = new HashMap<>();

        // put() - adding entries
        students.put(101, "John");
        students.put(102, "Alex");
        students.put(103, "Emma");
        students.put(104, "Sophia");
        students.put(105, "Daniel");
        students.put(106, "Olivia");
        students.put(107, "Liam");
        students.put(108, "Noah");
        students.put(109, "Ava");
        students.put(110, "Mason");

        System.out.println("Initial Map: " + students);

        // get() - accessing value by key
        System.out.println("Student with roll number 105: " + students.get(105));

        // containsKey()
        System.out.println("Contains roll number 103? " + students.containsKey(103));

        // containsValue()
        System.out.println("Contains student John? " + students.containsValue("John"));

        // size()
        System.out.println("Total students: " + students.size());

        // remove()
        students.remove(110);
        System.out.println("After removing roll number 110: " + students);

        // isEmpty()
        System.out.println("Is map empty? " + students.isEmpty());

        // Iterating using entrySet() (BEST WAY)
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }

        // keySet()
        System.out.println("\nAll roll numbers:");
        for (Integer rollNo : students.keySet()) {
            System.out.println(rollNo);
        }

        // values()
        System.out.println("\nAll student names:");
        for (String name : students.values()) {
            System.out.println(name);
        }

        // clear()
        students.clear();
        System.out.println("\nAfter clear(): " + students);
        System.out.println("Size after clear(): " + students.size());
    }
}
