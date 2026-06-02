// After multithreading: Task1 + Task2 + Task3 (simultaneously)

package J11_Multithreading;

class Task implements Runnable {
    private final String symbol;

    Task(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d%s ", i, symbol);
        }
        System.out.println("\n" + symbol + " Task Completed.");
    }
}

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new Task("*"));
        Thread t2 = new Thread(new Task("#"));
        Thread t3 = new Thread(new Task("@"));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    }
}