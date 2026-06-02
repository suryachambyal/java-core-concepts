package J11_Multithreading.wait_notify;

/*
 * Producer Thread
 *
 * Generates data and places it into the shared resource.
 * If the resource is already full, the producer waits.
 * 
 */

public class Producer implements Runnable {
    private final SharedResource resource;

    Producer (SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                resource.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
