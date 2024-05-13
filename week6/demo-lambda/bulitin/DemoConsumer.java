package bulitin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class DemoConsumer {
  
  public static void main(String[] args) { //有入無出
    // void accept (T t)
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("hello");

    Consumer<List<Integer>> printer2 = (integers) ->{
        for (Integer num : integers){
          System.out.println(num);
        }
    };
    printer2.accept(new ArrayList<>(List.of(13,300,29)));

    BiConsumer<String, Boolean> printer3 = (s, b) ->{
      if (b == true)
        System.out.println(s);
      else
        System.out.println(s.length());
    };
    printer3.accept("Bootcamp", false);

    BiFunction<Integer, Integer, Integer> sum = (x , y) ->{
      return x + y;
    };
    sum.apply(3,4); //7

    List<String> strings = new LinkedList<>();
    strings.add("xyz");
    strings.add("abc");

    int o = 3;

    // usage: sumup
    // for each
    for (String s : strings) {
      o += 1;
    }
    // for loop
    for (int i = 0 ; i< strings.size() ; i++){
      o += 1;
    }  

    // for each (lambda - List -> Consumer)
    strings.forEach(s -> {
    // o += 1;  // lambda foreach: cannot modify non-local variable
      int p = 1; 
      System.out.println(s);
    });
    // p = 2; //not ok

    // foreach (lambda - Map -> BiConsumer)
    Map<String, String> nameMap = new HashMap<>();
    nameMap.put("Vincent","abc");
    nameMap.put("Jenny", "def");
    for (Map.Entry<String,String> entry : nameMap.entrySet()){

    }
    nameMap.forEach((k, v) -> {
      System.out.println("k=" + k + ", v=" + v);
    });

    // before foreach
    for (String str : strings){
      str = "hello";
      System.out.println("inside:" + str);  //inside:hello x2
    }
    System.out.println("outside" + strings);  //outside[xyz, abc]

    // after foreach
    strings.forEach(e ->{
      e = "hello";
      System.out.println("inside:" + e);  //inside:hello x2
    });
    System.out.println("outside" + strings);  //outside[xyz, abc]

    Queue<String> q = new LinkedList<>();
    strings.forEach(e ->  {
      q.add(e);  // OK
   //   q = new ArrayDeque<>(); // not ok ->wont change address
    });

    Queue<String> q2 = new LinkedList<>();
    for (String str : strings){
      q2.add(str); //OK
      q2 = new ArrayDeque<>(); // can change指針 ok
    }
  }
}
