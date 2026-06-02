package J11_Multithreading;

/* Thread priority is an integer value that acts as a hint to the Thread Scheduler to determine the relative importance and execution order of threads.
| Priority | Meaning |
| -------- | ------- |
| 1        | Lowest  |
| 5        | Default |
| 10       | Highest |
Thread.MIN_PRIORITY (1): The lowest priority a thread can have.
Thread.NORM_PRIORITY (5): The default priority assigned to every thread if not explicitly defined.
Thread.MAX_PRIORITY (10): The highest priority available to a thread.
*/

class MyThread5 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
        }
    }
}

public class TestPriority {
    public static void main(String[] args) {

        Thread t1 = new MyThread5();
        t1.setName("Low");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new MyThread5();
        t2.setName("High");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}