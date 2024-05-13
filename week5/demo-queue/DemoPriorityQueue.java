import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(12);  
    integers.add(5);  
    integers.add(1000);
    integers.add(-2);  
    System.out.println(integers); // [-2, 5, 1000, 12]  // not yet sort
    System.out.println(integers.poll());  // -2,sorting
    System.out.println(integers.poll());  // 5,sorting
    System.out.println(integers.poll());  // 12,sorting
    System.out.println(integers);   // [1000]  // will sort during poll()

  }
}
