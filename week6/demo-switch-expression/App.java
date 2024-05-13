public class App {
  public static void main(String[] args) {
    Weekday day = Weekday.FRIDAY;
    switch(day){
      case MONDAY:
      System.out.println("Monday");
      break;
      case TUESDAY:
      System.out.println("Tuesday");
      break;
      case WEDNESDAY:
      System.out.println("Wednesday");
      break;
      case THURSDAY:
      System.out.println("Thursday");
      break;
    // missing Friday handling (Syntax OK)
      default:
    }
    
    // After Java 14
    // - compile-time -> cross checking (missing enum value or duplicated enum value)
    int value = switch (day){  
      case MONDAY, TUESDAY, THURSDAY -> 3;  // 3 is a return int value
      case WEDNESDAY, FRIDAY -> 2;
    };
    System.out.println(value);

    // yield similar to return
    int value2 = switch (day){
      case MONDAY:
       yield 3;
      case TUESDAY,THURSDAY:
       yield 4;
      case WEDNESDAY, FRIDAY:
       yield 5;
      default: 
       yield 3;
    };
    System.out.println(value2);

    int value3 = switch (day){
      case MONDAY -> {
        System.out.println("Monday");
       yield 3;
      }
      case TUESDAY,THURSDAY -> {
        System.out.println("Tuesday or Thursday");
       yield 4;
      }
      case WEDNESDAY, FRIDAY -> {
        System.out.println("Wednesday or Friday");
       yield 5;
      }
      default -> {
        System.out.println("Default");
        yield -1;
      } 
    };
    System.out.println(value3);
  }
}
