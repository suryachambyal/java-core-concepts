// Before multithreading: Task1 → Task2 → Task3

package J11_Multithreading;

public class Task1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // First Task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* Task Completed.");

        // Second Task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task Completed.");

        // Third Task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println("\n@ Task Completed.");

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    }
}

