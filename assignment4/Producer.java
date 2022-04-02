import java.util.Random;

public class Producer implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int value = random.nextInt(20);
        System.out.println("Thread " + Thread.currentThread().getName() + " add " + value + " into queue");
        Main.threadSafeQueue.add(value);
    }
}
