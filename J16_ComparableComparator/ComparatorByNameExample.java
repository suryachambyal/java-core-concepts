package J16_ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparatorByNameExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Charlie"));
        students.add(new Student(1, "Adam"));
        students.add(new Student(2, "Bob"));

        students.sort(Comparator.comparing(student -> student.name));

        System.out.println(students);
    }
}
