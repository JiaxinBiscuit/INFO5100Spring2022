import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<T> {

    Queue<T> queue;

    public ConcurrentQueue(){
        queue = new LinkedList<>();
    }

    public void add(T data){
        synchronized(Main.lock){
            queue.add(data);
        }
    }

    public T remove(){
        synchronized(Main.lock){
            return queue.remove();
        }
    }

    public T peek(){
        synchronized(Main.lock){
            return queue.peek();
        }
    }




}
