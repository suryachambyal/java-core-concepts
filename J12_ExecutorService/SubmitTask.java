package J12_ExecutorService;

// Task class for submit() example
public class SubmitTask implements Runnable {

    private int id;

    public SubmitTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}