import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();  // actually two way
    strings.add("hello");
    strings.add("abc");
    System.out.println(strings.size());  //2

    strings.remove(1);
    System.out.println(strings);  // [hello]
    System.out.println(strings.contains("hello"));  //true

    // ArrayList methods != LinkedList methods??
    // ArrayList and LinkedList has its own methods

    List<String> ls = new LinkedList<>();
    ls.add("abc");
    ls.add("def");
    ls.add("Vincent");
    for (int i = 0; i < ls.size(); i++){   //for loop-> loop through all
      System.out.println(ls.get(i));  // usually not use like this 
    }  // Arraylist-> array: sort directly by get
       // Linkedlist-> list: get: loop through all

       // for each
    for (String s : ls){ //next
      if("def".equals((s)))
         System.out.println("this is def");
    }

    LinkedList<String> ll = new LinkedList<>();
    ll.add("hello");
    ll.addLast("abc");
    ll.addFirst("Jenny");
    System.out.println(ll); //[Jenny, hello, abc]

    ArrayList<String> as = new ArrayList<>();
    as.add("hello");
    as.add("ijk");
    as.add("def");
    as.remove(1); //remove: resize -> for loop 
  }
}
