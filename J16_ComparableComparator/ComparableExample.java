package J16_ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Charlie"));
        students.add(new Student(1, "Adam"));
        students.add(new Student(2, "Bob"));

        Collections.sort(students);

        System.out.println(students);
    }
}