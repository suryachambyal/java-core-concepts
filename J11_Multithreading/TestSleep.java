package J11_Multithreading;

class MyThread3 extends Thread {

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


public class TestSleep {
    public static void main(String[] args) {
        
        Thread t1 = new MyThread3();
        t1.setName("Worker-1");
        
        Thread t2 = new MyThread3();
        t2.setName("Worker-2");
        
        Thread t3 = new MyThread3();
        t3.setName("Worker-3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
