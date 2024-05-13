public class App {
  public static void main(String[] args) {
     //
     // checked exception  (compile time exception)
       
     // unchecked exception (run-time exception)
     // 1.IllegalArgumentException
     // if salary array contain negative, treat total = 0

     // try&catch
     int total = 0;
     try{  
       total = totalSalary(new int[]{100, -10, 45});  // java.lang.IllegalArgumentException 
     } catch (IllegalArgumentException e){
      total = 0;
     }
     System.out.println("total=" + total);

     // 2.ArithmeticException
     int x = 0;  
//   int r2 = x == 0 ? 0 : 8 / x;
     int r2 = 0;
     try{ 
        r2 = 8 / x;  // java.lang.ArithmeticException: / by zero
     } catch (ArithmeticException e){
      // ...
     }
  
     // 3.ArrayIndexOutOfBoundsException
     try{
      getString(new char[]{'c','a','t'}, -2,2);
     } catch (ArrayIndexOutOfBoundsException e ){
      //..
     }

     // 4. NullPointerException  <-- myself syntax
     String s = "hello";
     s = null;
     // Solution 1 (Not suggested)
     try {
      System.out.println(s.charAt(0));
     } catch (NullPointerException e){

     }
     // Solution 2
    if  (s != null)
       System.out.println(s.charAt(0));

     // 5. StringIndexOutOfBoundsException
     String s2 = "hello";
     try {
       System.out.println(s2.charAt(5));
     } catch (StringIndexOutOfBoundsException e){

     }
     // 6. throw new IllegalStateException()
     int n1 = 7;
     int n2 = -8;

     try{
      checkPararmeters(n1,n2);
     }catch (IllegalStateException e){
      System.out.println("Handled the IllgealStateException");
     }

    // 7. 
    try{
    int mum = Integer.parseInt("10s");
    } catch (NumberFormatException e){
      System.out.println("Handled the NumberFormatException");
    }


    }
  public static String getString(char[] characters, int beginIdx, int endIdx){
    StringBuilder sb = new StringBuilder();
    for (int i = beginIdx; i <= endIdx; i++){
      sb.append(characters[i]);
    }
    return sb.toString();
  }
  

  public static int totalSalary(int[] arr){  // assume only +ve integer
    int sum = 0;
    for ( int x : arr){
      if (x < 0)
       throw new IllegalArgumentException();  // an error event
      sum += x;
    }
    return sum;
  }

  public static void checkPararmeters(int n1,int n2){
    if ( n1 + n2 > 0)
     System.out.println("correct");
    if ( n1 * n2 > 100)
     System.out.println("Correct");
     throw new IllegalStateException();
  }
}
