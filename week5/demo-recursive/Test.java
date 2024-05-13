public class Test {
  static void print(int test){
    if ( test < 1){
      return;
    }
    System.out.printf("%d ", test);
    print(test - 1);
    System.out.printf("%d ", test);   
  }

  public static void main(String[] args) {
    print(4);
  }

  public int factorial(int n){
    if (n <= 1){
      return 1;
    }
    return n * factorial(n -1);
  }
}
