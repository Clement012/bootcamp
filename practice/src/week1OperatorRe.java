public class week1OperatorRe {
  public static void main(String[] args){
  // Operatior 
// increment/predecrement --> pre/postdecrement --> post/
int i7 = 1;
i7 += i7; // = +1
i7++; // = +1  /increment
int i4 = 10;
i4 -= i4; // =9
i4--; //=8  /decrement
int i5 = 5;  
int pre = i5 + 2; 
System.out.println(pre); //7 
System.out.println(i5); //5 
int predecrement2 = ++i5 ; //*****this step is important 計左++先
System.out.println(predecrement2); //6 
// if i5++ = 5 because i5 is first 
System.out.println(i5++); //6 correct
int i6 = 5;
int postdecrement = i6 + 2;
System.out.println(postdecrement); //7 
System.out.println(i6); //5 
int postdecrement2 = i6-- ; //***** this step is important i6先--
System.out.println(postdecrement2); //5
System.out.println(i6); //4 
  }
}
