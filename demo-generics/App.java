import java.util.ArrayList;
import java.util.List;

public class App {
  
  public static void main(String[] args) {
    // Generic: Before Java1.5
    List ls = new ArrayList<>();  // Object:anything
    ls.add("@");
    ls.add(123);
    ls.add(123L);
    ls.add(123.3d);
    System.out.println(ls);
 
   
    System.out.println(((String) ls.get(0)).charAt(0));  //@

    for (Object o : ls){
      if (o instanceof String){
        String s = (String) o;
        System.out.println(s.concat("Hi"));
      }else if (o instanceof Long){

      }
    }
    // After Java 1.5 -> Generics
    List <String> ls2 = new ArrayList<>();  // Object: defind String
    ls2.add("hi");
    List <Long> ls3 = new ArrayList<>(); // defind Long
    ls3.add(3l);
  }
}
