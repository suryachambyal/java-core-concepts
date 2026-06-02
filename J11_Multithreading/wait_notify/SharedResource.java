package J11_Multithreading.wait_notify;

/*
 * Shared Resource
 *
 * Demonstrates inter-thread communication using wait() and notify().
 *
 * Producer:
 *  - Produces data.
 *  - Waits if data is not yet consumed.
 *
 * Consumer:
 *  - Consumes data.
 *  - Waits if no data is available.
 *
 * Synchronization ensures that only one thread
 * accesses the shared resource at a time.
 */

public class SharedResource {

    int data;
    boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {

        while (hasData) {
            wait();   // wait until consumed
        }

        data = value;
        hasData = true;

        System.out.println("Produced: " + value);

        notify();   // wake consumer
    }

    public synchronized void consume() throws InterruptedException {

        while (!hasData) {
            wait();   // wait until produced
        }

        System.out.println("Consumed: " + data);

        hasData = false;

        notify();   // wake producer
    }
}