import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
    Queue<T> threadSafeQueue;

    public ThreadSafeQueue(){
        threadSafeQueue = new LinkedList<>();
    }

    public void add(T data){
        synchronized(Main.lock){
            threadSafeQueue.add(data);
        }
    }

    public T remove(){
        synchronized(Main.lock){
            if(!threadSafeQueue.isEmpty()){
                return threadSafeQueue.remove();
            }else{
                return null;
            }
        }
    }

    public T peek(){
        synchronized (Main.lock) {
            return threadSafeQueue.peek();
        }

    }

    public boolean isEmpty(){
        synchronized (Main.lock) {
            return threadSafeQueue.isEmpty();
        }
    }




}
