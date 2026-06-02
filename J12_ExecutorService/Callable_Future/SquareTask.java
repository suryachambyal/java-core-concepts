package J12_ExecutorService.Callable_Future;

import java.util.concurrent.Callable;

// Task that returns square of a number

public class SquareTask implements Callable<Integer> {
    private int num;

    public SquareTask(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws InterruptedException{
        Thread.sleep(2000);
        return num * num;
        
    }
    
}
