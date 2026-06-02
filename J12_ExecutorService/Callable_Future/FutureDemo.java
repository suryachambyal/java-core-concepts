package J12_ExecutorService.Callable_Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Demonstrates Callable and Future.
 *
 * Callable:
 * - Similar to Runnable
 * - Can return a result
 *
 * Future:
 * - Represents the result of an asynchronous computation
 * - get() waits for task completion and returns the result
 */

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = service.submit(new SquareTask(2));
        Future<Integer> f2 = service.submit(new SquareTask(3));
        Future<Integer> f3 = service.submit(new SquareTask(4));

        // get() -> wait + fetch result
        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());
        System.out.println("Result 3: " + f3.get());

        service.shutdown();
    }
}
