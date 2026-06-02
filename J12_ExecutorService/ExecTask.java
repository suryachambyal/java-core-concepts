package J12_ExecutorService;

// Task class for execute() example
public class ExecTask implements Runnable {

    private int id;

    public ExecTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}