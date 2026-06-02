package J11_Multithreading.wait_notify;

public class TestWaitNotify {
    
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(new Producer(resource), "Producer");
        Thread consumer = new Thread(new Consumer(resource), "Consumer");

        producer.start();
        consumer.start();

    }
}
