import java.util.List;
import java.util.function.Predicate;

public class App {
  public static void main(String[] args) {
    // Java 10
    String x = "hello";

    var x2 = "hello";  //compile-time: compiler knows x2 is with type String
    // String x2 ="hello"  // x2 = 100; XXXXXX
    
    var age = 10;
    var name = "Vincent";
    var names = (List.of("Vincent","Oscar"));

    for ( var n : names){
      System.out.println(n);
    }

    var Dog = new Dog();

    Predicate<String> isTooLong = e -> e.length() > 10;
    // var isTooLong = e -> e.length() > 10;
    
    // var arr = {1 , 2 , 3}; // cant defind in whic primitive
    var arr = new int[]{1,2,3};
  }
  // Cannot Do in var

  // 1.return type
  // public static var print(int x){
  //  return x; }

  // 2. instance type
  // refer to Dog.class

  // 3. without initialzation
  // var n;

  // 4. Lambda

  // 5. Array

  // 6. input parameter
  //public static var sum(var x , var y){
 // return x + y; }
  
}
