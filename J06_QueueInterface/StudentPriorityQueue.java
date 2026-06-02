package J06_QueueInterface;

import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {

        // PriorityQueue with custom priority based on grade
        // A comes before B, B before C, and so on

        PriorityQueue<Student> queue =
                new PriorityQueue<>((s1, s2) ->
                        Character.compare(s1.getGrade(), s2.getGrade()));

        // Adding students
        queue.add(new Student("James", 'B'));
        queue.add(new Student("Henry", 'A'));
        queue.add(new Student("Liam", 'C'));
        queue.add(new Student("Mike", 'A'));

        System.out.println("Students removed according to priority:");

        // Removing students in priority order
        while (!queue.isEmpty()) {
            Student student = queue.poll();

            System.out.println(student.getName() + " - Grade " + student.getGrade());
        }
    }

    // Custom Student class
    private static class Student {

        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}