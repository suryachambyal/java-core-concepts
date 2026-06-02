package J11_Multithreading.wait_notify;

/*
 * Consumer Thread
 *
 * Consumes data from the shared resource.
 * If the resource is empty, the consumer waits.
 * 
 */

public class Consumer implements Runnable {
    private SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(500);
                resource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
