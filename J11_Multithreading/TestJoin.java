package J11_Multithreading;

class MyThread4 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);

            try {
                Thread.sleep(1000);   // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " finished.");
    }
}


public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new MyThread4();
        t1.setName("Worker-1");
        
        Thread t2 = new MyThread4();
        t2.setName("Worker-2");
        
        Thread t3 = new MyThread4();
        t3.setName("Worker-3");

        t1.start();
        t1.join();  // wait for t1 to complete

        t2.start();
        t2.join();  // wait for t2 to complete

        t3.start();
        t3.join();  // wait for t3 to complete

        System.out.println("All threads completed.");
    }
    
}
