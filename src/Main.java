public class Main {
    public static void main(String[] args) throws InterruptedException {
        final ThreadGroup threadGroup = new ThreadGroup("Main");

        System.out.println("Создаю потоки...");
        new MyThread(threadGroup, "Thread-1").start();
        new MyThread(threadGroup, "Thread-2").start();
        new MyThread(threadGroup, "Thread-3").start();
        new MyThread(threadGroup, "Thread-4").start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки.");
        threadGroup.interrupt();
    }
}
