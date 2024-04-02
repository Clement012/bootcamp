public class DemoIf {
    public static void main(String[] args) throws Exception{
        int x = 8;
        int y = 0;
        if (x > 3); {
            y = 10;
        System.out.println("Hello, World!" + y);
        }  {
        System.out.println("Clement");
        }

        if (x > 2){
            System.out.println("x > 2");
        } else if (x >= 0 && x<= 2 )
        {System.out.println(x >= 0 && x<= 2);
        }

        boolean d = true;
        System.out.println(d);

        //Example one
        int a = 3;
        int b = 2;
        int max = 1;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        //from line 20(other method)
        // int max = a 
        // if  (b > a){max = b}
        System.out.println("The max number is " + max + ".");

        //Example two
        //method A: list out all example x7
        //method B
        //String if: no "="
        String day = "Sunday";
        String target = "weekend";
        if (day.equals("Monday")|| day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            target = "weekday";
        }
        System.out.println(day + " is " + target);
        System.out.println(day);
        //Print out: Sunday is weekend

        //Compare Strings
        //1. String value compares with String variable ("Monday".equal(day))
        //2. String variable compares with String variable

        // Example three
        // score > 90 -> A / 80 - 90 -> B / 70 - 80 -> C / <70 -> F
        // over C is pass& F is Fail
        int score = 85;
        char grade = 'B';
        // Print out: "The score and The grade is B and passed"
        if (score > 90){
            grade = 'A';
        } else if (score >= 80 && score <= 90){ 
            grade = 'B';
            // score <= 90 inB can be removed coz fact chked >90 inA
        } else if (score >= 70 && score <= 79){
            grade = 'C';
        } else {
            grade = 'F';
        }
        String examResult = "passed";
        if (grade == 'F' ){
            examResult = "failed";
        }
        System.out.println("The grade is "+ grade + " and "+ examResult + ".");

        ////Critical thinking!
        //how to minimize the command? 
        //to let the program run faster!

        //String
        String s1 = "helloO";
        // chk if the length of s1 > 5
        if (s1.length() > 5){
            System.out.println("s1.length() > 5");
        }
        // Another approach (! means not)
        if (!(s1.length() <= 5)){
             System.out.println("s1.length() > 5");
        }
        // char (==, !=)
        char gender = 'F';
        if (gender == 'M') {

        } else if (gender == 'F'){

        }
        if (gender != 'F') {
            System.out.println("gender is not equals to M");}

        // int, long etc (==, !=, >=, <=, >,=)

        // boolean (==, !=)
        // !:not !=: except that situation

        // String.charAt(int index) -> return char
        String s2="abcdefg";
        // Check if s2 start with 'a' and end with 'g',print out 'yes', otherwise 'no'
        if (s2.charAt(0) == 'a' && s2.charAt(s2.length() - 1) == 'g'){
        System.out.println("yes");
        }else {
            System.out.println("no");
        }

        // true & false / true || false : 8 option
        System.out.println(true && false);
        System.out.println(true || false);
    }
}
