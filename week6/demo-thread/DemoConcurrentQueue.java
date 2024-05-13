import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DemoConcurrentQueue {

  static Queue<Character> queue = new ConcurrentLinkedQueue<>();  // created method in java
  public static void main(String[] args) {
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 1_000_000; i++){
        queue.add('s');
      }
    };
    Thread t1 = new Thread(concatLinkedList);
    Thread t2 = new Thread(concatLinkedList);
    t1.start();
    t2.start();

    // 3 threads to 1 thread
    try{
      t1.join();
      t2.join();
    }catch (InterruptedException e){

    }
    System.out.println(queue.size());

  
  }
}
