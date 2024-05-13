public class App {
  

  public static void main(String[] args) throws Exception {
    
    int result = 1;
    for (int i = 1; i <=5; i++){
      result *= i;
    }
    System.out.println(result);
    System.out.println(multiply(5));
    System.out.println(addEven(100));
    System.out.println(FS(90));
  }
    public static int multiply(int n){
      // base case (exit criteria)
      if (n <= 1)
      return n;
      return n * multiply(n-1);
      // 5 * (5-1) -> waiting 1 release 4 (when we put (5-1) to multiply(), we are waiting an int value returned)
      // 4 * (4-1) -> waiting 2 release 3
      // 3 * (3-1) -> waiting 3 release 2
      // 2 * (2-1) -> waiting 4 release 1
      // 1 -> return 1
  }
   public static int addEven(int n){
     if (n <= 2)
     return n;
     return n + addEven(n - 2); 
  }
   public static int FS(int n){
    if (n <= 2)
    return n - 1;
    return FS(n - 1) + FS(n - 2);
   }
}
