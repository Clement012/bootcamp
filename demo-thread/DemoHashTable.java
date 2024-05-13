import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashTable {
  // HashTable -> Thread-safe
  // HashMap -> non Thread-safe
  static HashMap<Character, Integer> ht = new HashMap<>();  //depends on computer CPU
  static Hashtable<Character, Integer> ht2 = new Hashtable<>(); // 2000000
    public static void main(String[] args) {
      
    Runnable concat = () -> {
      for (int i = 0; i < 1_000_000; i++){
        ht.compute('s',(x , y) -> { //compute -> same meaning of add
          if (y == null)
          return 1;
          return y + 1;
        });
      }
    };
    Thread t1 = new Thread(concat);
    Thread t2 = new Thread(concat);
    t1.start();
    t2.start();

    // 3 threads to 1 thread
    try{
      t1.join();
      t2.join();
    }catch (InterruptedException e){

    }
    System.out.println(ht.get('s'));

  
  }
}
