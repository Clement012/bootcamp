public class Practice {
  public static void main(String[] args) {
    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year:
     * If a year is divisible by 4 and not divisible by 100 or divisible by 400,
     * then, it is a leap year.
     */
    int year1 = 2009 ;
    // Program a condition to check if it is a leap year.
    // But should NOT print anything.
    if ( year1 % 4 == 0 && year1 % 100 > 0|| year1 % 400 ==0 ) { 
      System.out.println(year1 + " is a leap year.");
    }
    int year2 = 2020;
    // same as the above, but it will print out.
    if ( year2 % 4 == 0 && year2 % 100 > 0|| year2 % 400 ==0 ) { 
      System.out.println(year2 + " is a leap year.");
    }
    int year3 = 2400;
    // code here ... same as the above, but it will print out.
    if ( year3 % 4 == 0 && year3 % 100 >0|| year3 % 400 ==0) {
      System.out.println(year3 + " is a leap year.");
    }
    int year5 = 2100;
    // code here ...same as the above, but it will NOT print out.
    if ( year5 % 4 == 0 && year5 % 100 >0|| year5 % 400 ==0){
      System.out.println(year5 + " is a leap year.");
    }
    
  }
}