
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
// 等如 左手邊:指針
// 右手邊:真實材能
  public static void main(String[] args) {
    // Queue is a contact/ interface
    List<String> strings = new LinkedList<>();  
    strings.add("hello");
    strings.remove(0);
    strings.add("def");

    Queue<String> strings2 = (Queue<String>) strings;  //risk-> type safety
    // strings2.remove(1);  /// queue does not have index concept 
    strings2.add("abc");
    System.out.println(strings2.size()); // 2
    
    System.out.println(strings2.poll()); //def (poll() means remove and return the head object) 
    System.out.println(strings2); // [abc]
    System.out.println(strings2.poll()); // abc
    System.out.println(strings2.poll()); // null

    strings2.add("xyz");
    strings2.add("ijk");
    System.out.println(strings2.peek()); ///xyz //return the head object (without removal)
    
    // while loop (this case -> remove object and read object)
    while (!strings2.isEmpty()){  //size() is not stable
      System.out.println(strings2.poll());
    }
    System.out.println(strings2.size());  /// 0


    // Remove even number
    Queue<Integer> integers = new LinkedList<>();  //polymorphism
    // why left side Queue and right side LinkedList?
    // coz linkedlist so many function 
    // omly queue can be more accurate to present. 指針窄左
    integers.add(1);
    integers.add(101);
    integers.add(2);
    integers.add(99);
    integers.add(-8);

    Queue<Integer> integers2 = integers; // no back up
    // this means backup at 指針 not backup at object

    int size = integers.size();  // pass by refernce
    int val = -1;
    while(size-- > 0){
       val = integers.poll();
       if (val % 2 == 1)
         integers.add(val);
      }
      System.out.println(integers);
      System.out.println(integers2.size()); //3

      System.out.println(integers2.remove()); //1, what is the difference between remove() and poll()?
      System.out.println(integers);  // [101,99]
      System.out.println(integers2.remove()); //101
      System.out.println(integers2.remove()); // 99 
      System.out.println(integers2.size()); // 0
  // System.out.println(integers2.remove());  // java.util.NoSuchElementException

      integers.add(2000);
      integers.add(1000);
      System.out.println(integers.remove(1000)); // true because Integer.class has override equals()
      System.out.println(integers.remove(1500)); // false because Integer.class has override equals()

      //pass by value
      String x = "hello";
      String x2 = x;
      x = x + "world"; // x object (new object), because String is immutable
      System.out.println(x2); // hello

      int[] arr = new int[]{2,1,3};
      int[] backup = Arrays.copyOf(arr, arr.length); // copyOf() -> create another array
      arr[1] = 100;
     // System.out.println(Arrays.());
    }
  }
