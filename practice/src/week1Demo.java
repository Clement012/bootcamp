public class week1Demo {
  public static void main(String[] args){
  //If
  int x = 5;
  int y = 4;
  if (x > y){
    System.out.println("Yes!");
  }
  int z = 8;
  if (x < y) {
    System.out.println("Hello");
  } else if (z >= x && z >= y){
    System.out.println("Hi");
  }
  // in this case/ program starts: 
  // when x>y: output Hello
  // when x<=y && z>x&y: output Hi

  // Example 1
  // System output: Sunday is weekend.
  String day = "Sunday";
  String target = "weekend";
  if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
    target = "weekday";
  }
  System.out.println(day +" is "+ target);
  // in this case/ program starts:
  // think+list out all the variable 
  // : 1-5 ->target weekday
  // : 6-7 ->target weekend

  // Example 1a 
  // System output: Monday is weekday
  String day2 = "Monday";
  String target2 = "weekday";
  if (day2.equals("Saturday")||day2.equals("Sunday")){
    target2 = "weekend";
  }
  System.out.println(day2 + " is " + target2);

  // Example 2
  // score > 90 -> A / 80 - 90 -> B / 70 - 80 -> C / <70 -> F
  // over C is pass& F is Fail
  // Print out: "The score is "" and The grade is "" and "" "

  int score = 48;
  char grade = 'A';
    if (score > 90 ){
      grade = 'A';
  }
    else if (score >= 80){
      grade = 'B';
    }
    else if (score >= 70){
      grade = 'C';
    }
    else if (score < 70){
      grade = 'F';
    }
    String examResult = "Passed";
    if (score < 70){
      examResult = "Failed";
    }
    System.out.println("The score is "+ score + " and the grade is " + grade + " and " + examResult);

    // Example 3
    // Check pattern first and last letter 
    String s2 = "abcdefgh";
    if (s2.charAt(0) == 'a' && s2.charAt(s2.length() - 1) == 'f'){
    System.out.println("Yes");
    }
    else  {System.out.println("No");
  }
    System.out.println(true && true);  //true
    System.out.println(true && false);  //true
    System.out.println(false && true);  //true
    System.out.println(false && false); //false

    System.out.println(true || true);  //true
    System.out.println(true || false);  //false
    System.out.println(false || true);  //false
    System.out.println(false || false);  //false

  }
}
