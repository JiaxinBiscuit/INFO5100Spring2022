public class Main {

    public static Object lock = new Object();
    public static ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>();

    public static void main(String[] args) {
        Thread[] producer = new Thread[5];
        Thread[] consumer = new Thread[5];

        for (int i = 0; i < producer.length; i++) {
            producer[i] = new Thread(new Producer());
            consumer[i] = new Thread(new Consumer());
            producer[i].setName("Producer" + i);
            consumer[i].setName("Consumer" + i);
            producer[i].start();
            consumer[i].start();
        }

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }

}
