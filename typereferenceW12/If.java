public class If {
  public static void main(String[] args) {
    // Example 1
    int x = 1;
    if (x > 2) {
      System.out.println("x > 2");
  } else if (x >= 0 && x <= 2) { // AND events
      System.out.println("x >= 0 and x <= 2");
  } else {
      System.out.println("x < 0");
  }
    // Example 2
  int a = 12;
  int b = 10;
  int max = a;
  if (b > a) {
      max = b;
  }
  System.out.println("The max number is " + max + ".");
  // Print out: The max number is 12.

    // Example 3
//  String day = "Sunday"; 
//  if (day.equals("Sunday")) {
 //     System.out.println(day + "is weekend");
//  } else if (day.equals("Saturday")) {
//      System.out.println(day + "is weekend");
//  } else if (day.equals("Monday")) {
//      System.out.println(day + "is weekday");
//  } else if (day.equals("Tuesday")) {
//      System.out.println(day + "is weekday");
//  } else if (day.equals("Wednesday")) {
//      System.out.println(day + "is weekday");
//  } else if (day.equals("Thursday")) {
//      System.out.println(day + "is weekday");
//  } else {
//      System.out.println(day + "is weekday");
//  }
  // Print out: Sunday is weekend.
  String target = "weekend";
  if ("Monday".equals(day) || "Tuesday".equals(day)
          || "Wednesday".equals(day) || "Thursday".equals(day)
          || "Friday".equals(day)) {
      target = "weekday";
  }
  System.out.println(day + " is " + target);

  // Example 3
  int score = 85;
  char grade = ' ';
  // score > 90 -> A (Pass)
  // 80 - 90 -> B (Pass)
  // 70 - 79 -> C (Pass)
  // < 70 -> F (Fail)
  if (score > 90) {
      grade = 'A';
  } else if (score >= 80) {
      grade = 'B';
  } else if (score >= 70) {
      grade = 'C';
  } else {
      grade = 'F';
  }
  String examResult = "passed";
  if (grade == 'F') {
      examResult = "failed";
  }
  System.out.println("The grade is" + grade + " and " + examResult + ".");
  // Print out: "The grade is B and passed."
  }
}
