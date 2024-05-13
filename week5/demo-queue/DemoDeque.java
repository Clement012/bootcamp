import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoDeque {
  public static void main(String[] args) {
    // Deque extends Queue
    Deque<String> strings = new LinkedList<>();

    strings.add("hello");  // addLast -> tail
    strings.add("abc");
    strings.addFirst("ijk");  //addFirst -> head
    System.out.println(strings); //[ijk, hello, abc]

    System.out.println(strings.poll()); //ijk // pollFirst()
    System.out.println(strings.pollLast()); //abc
    System.out.println(strings);  // [hello]
    
   // strings.remove();
   // strings.clear();

    strings.add("world");
    System.out.println(strings.peekFirst()); //hello
    System.out.println(strings.peekLast());  //world

    strings.pop();  //removeFirst
    System.out.println(strings);  //world

    strings.push("mmm"); // addFirst
    System.out.println(strings); // [mmm,world]

    // stack (pop,push)
    List<String> strings3 = new Stack<>(); // thread-safe
    strings3.add("hello");

    Stack<String> strings4 = new Stack<>();
    strings4.push("hello");
    strings4.push("hello2");
    strings4.push("hello3");
    System.out.println(strings4.pop());  // hello3

    System.out.println(strings4);
    
    // stack Use case: reverse 


    // Queue/ Deque -> LinkedList or Array
    Queue<String> qs = new ArrayDeque<>();    // LinkedList / Array
    qs.add("Hello");
    qs.add("abc");   // array -> resize
    System.out.println(qs.poll());  //hello

    qs.add("x");
    qs.add("y");
    qs.remove();
    System.out.println(qs);  // [x, y]
    qs.remove("y");
    System.out.println(qs);

    Deque<String> ds = (Deque<String>) qs;
    ds.addFirst("mnm");
    ds.addLast("nmn");  
    System.out.println(ds); // [mnm, x, nmn]

    System.out.println(qs); //[mnm, x, nmn, offer, ooo]
    qs.add("offer");
    qs.offer("ooo");
    System.out.println(qs);

    Deque<String> ds2 = new LinkedBlockingDeque<>(2);  /// can fix size -> () 
    ds2.add("hello");
    ds2.add("world");
    System.out.println(ds2.size());  // 2
    // ds2.add("xxx")
    System.out.println(ds2.offer("yyy")); // false
  }
}
