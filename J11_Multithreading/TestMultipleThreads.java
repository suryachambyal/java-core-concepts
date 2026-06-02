package J11_Multithreading;

class MyThread2 extends Thread {
    
    @Override
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}



public class TestMultipleThreads {
    public static void main(String[] args) {
        
        Thread t1 = new MyThread2();
        t1.setName("Worker-1");
        
        Thread t2 = new MyThread2();
        t2.setName("Worker-2");
        
        Thread t3 = new MyThread2();
        t3.setName("Worker-3");

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
    }
    
}
