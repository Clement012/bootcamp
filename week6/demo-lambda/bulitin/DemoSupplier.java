package bulitin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {  //無入有出
  public static void main(String[] args) {
    // T get;
    Supplier<String> hi = () -> "hello";
    System.out.println(hi.get()); //hello  // return String

    Supplier<Weekday> monday = () -> Weekday.MONDAY;
    Weekday monday2 = Weekday.MONDAY;

    printName(()-> Weekday.MONDAY);

    Supplier <LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());

    Supplier < Integer> random = () -> new Random().nextInt(10) +1;  // 0-9 +1
    System.out.println(random.get());
    
  }

  public static void printName(Supplier<Weekday> weekday){
    System.out.println(weekday.get());
  }
}
