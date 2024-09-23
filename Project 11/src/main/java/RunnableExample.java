class RunnableTask implements Runnable {
    private String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is running.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableTask("Task 1"));
        Thread thread2 = new Thread(new RunnableTask("Task 2"));

        thread1.start();
        thread2.start();
    }
}