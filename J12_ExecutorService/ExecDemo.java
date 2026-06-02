package J12_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ExecutorService
 *
 * ExecutorService is a high-level API for managing and executing threads.
 * Instead of creating threads manually, tasks are submitted to a thread pool.
 *
 * Benefits:
 * - Reuses threads (better performance)
 * - Better resource management
 * - Simplifies concurrent programming
 * - Supports Callable and Future
 *
 * Common Methods:
 *
 * execute(Runnable task)
 *   - Executes a task
 *   - No return value
 *
 * submit(Runnable/Callable task)
 *   - Executes a task
 *   - Returns a Future object
 *
 * shutdown()
 *   - Stops accepting new tasks
 *   - Already submitted tasks continue to execute
 */


public class ExecDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {

            // execute() → fire-and-forget
            // no result, no tracking, just runs the task
            service.execute(new ExecTask(i));
        }

        // stop accepting new tasks (already submitted tasks will complete)
        service.shutdown();
    }
}