package bulitin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {  //boolean case
  public static void main(String[] args) {
    int age2 =18;
    boolean isElderly2 = age2 > 65;

    Predicate<Integer> isElderly = age -> age > 65;
    System.out.println(isElderly.test(66));  // true
    System.out.println(isElderly.test(65));  // false

    BiPredicate<String, Integer> isCharacterS  // after running no storage 
                  = (str, idx) -> str.charAt(idx) == 'S';
    System.out.println(isCharacterS.test("Super", 0));  // true
       
      BiPredicate<String, String> startsWith = (s1,s2) -> s1.startsWith(s2);
      System.out.println(startsWith.test("hello","he"));  //true

      BiPredicate<String, String> endsWith = (s1,s2) -> s1.endsWith(s2);
      System.out.println(endsWith.test("hello","lo"));  //true

      BiPredicate<String, String> combined = startsWith.and(endsWith);
      System.out.println(combined.test("hello", "lo")); //false
      System.out.println(combined.test("lollo", "lo")); //true

      BiPredicate<String, String> combined2 = startsWith.or(endsWith);
      System.out.println(combined2.test("hello", "lo")); //true
      System.out.println(combined2.test("lollo", "lo")); //true
       
      BiPredicate<String, Integer> lengthLargerThan = 
           (s1, length) -> s1.length() > length;
    System.out.println(lengthLargerThan.test("hello",4));  //true


  } 
   public static boolean isCharacterS(String s, Integer idx){  // can store 
    return s.charAt(idx) == 'S';
   }
}
