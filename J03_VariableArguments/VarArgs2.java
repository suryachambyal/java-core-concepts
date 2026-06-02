package J03_VariableArguments;

public class VarArgs2 {

    public static void main(String[] args) {

        printStudents("Adam", "Bruce", "Charlie", "Daniel", "Ethan");
    }

    // Method accepting variable number of student names
    public static void printStudents(String... names) {

        System.out.println("Students:");

        for (String name : names) {
            System.out.println("- " + name);
        }
    }
}