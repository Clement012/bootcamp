


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Random;


public class DemoDate {
  public static void main(String[] args) {
    LocalDate day = LocalDate.of(2023,12,1);
    System.out.println(day.toString());  // 2023-12-01

    LocalDate day2 = LocalDate.parse("2023-12-01");
    System.out.println(day2.toString());  // 2023-12-01

    System.out.println(day == day2);  //false
    System.out.println(day.compareTo(day2));  // 0
    System.out.println(day.isEqual(day2));  // ture
    
    int year = day.getYear();
    Month month = day.getMonth();
    System.out.println(month.length(false));  //31
    System.out.println(Month.of(2).length(false));  //28
    
    Year y1 = Year.of(2024);
    System.out.println(y1.isLeap()); // true

    System.out.println(day.getDayOfWeek().toString()); //friday

    int random = new Random().nextInt(3); //0-2

    System.out.println(day.plusDays(31).toString()); // 2024-01-01
    LocalDate day3 = day.plusMonths(2);
    LocalDate day4 = day.plusYears(year);

    LocalDate today = LocalDate.now();
    System.out.println(today.toString());  //today

  }

}
