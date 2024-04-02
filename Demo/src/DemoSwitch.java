public class DemoSwitch {
  public static void main (String[] args){
    //Example 3
    // score > 90 -> A / 80 - 90 -> B / 70 - 80 -> C / <70 -> F
    char grade = 'A';

    switch (grade){
      case 'A':
       System.out.println("This is grade A");

      case 'B':
       System.out.println("This is grade B");

      case 'C':
       System.out.println("This is grade C");

      default:
       System.out.println("Defalut Value");
       // If A: output, all ABC+defalut output
       // So break -> exit

       //Example 3.2
       ///Grade A=5 B=4 etc
       //switch: cant compare value
       int score = 1;
       switch (grade){
         case 'E':
           score++;
         case 'D':
           score++;
         case 'C':
           score++;
         case 'B':
           score++;
         case 'A':
           score++;
         default:
         break;
       }
       System.out.println("score" + score);
    }
  }
}
