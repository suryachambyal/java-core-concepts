package J12_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SubmitDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {

            // submit() returns a Future<?> object used to cancel tasks or get results (via get()). 
            service.submit(new SubmitTask(i));
        }

        // stop accepting new tasks
        service.shutdown();
    }
}