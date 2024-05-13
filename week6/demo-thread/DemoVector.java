import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
    static List<Character> characters = new Vector<>();

    public static void main(String[] args) {
    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 1_000_000; i++){
        characters.add('s');
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
    System.out.println(characters.size());

  }  
}
