public class MyThread extends Thread {
    public MyThread(ThreadGroup threadGroup, String s) {
        super(threadGroup, s);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {
            err.printStackTrace();

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
