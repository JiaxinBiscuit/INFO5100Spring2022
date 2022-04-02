public class Consumer implements Runnable{
    @Override
    public void run() {
        System.out.println("Tread " + Thread.currentThread().getName() + " remove from the queue");
        Main.threadSafeQueue.remove();
    }
}
