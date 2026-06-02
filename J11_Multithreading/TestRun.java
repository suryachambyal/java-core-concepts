package J11_Multithreading;

// start() creates a new thread and then invokes run()
// run() directly executes in the current thread

class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class TestRun {

    public static void main(String[] args) {

        System.out.println("Main thread started.");

        // Creating thread object
        Thread t1 = new MyThread1();

        // Starting the thread
        t1.start();

        System.out.println("Main thread finished.");
    }
}