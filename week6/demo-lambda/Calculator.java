// @FunctionInterface

public interface Calculator {

  int square(int x);

  public static void main(String[] args) {
    Calculator ca = (x) -> {
      return (int)(Math.pow(x,2));
    };
    System.out.println(ca.square(3));  // 9

    // if we have only one parameter in the method of FunctionalInterface
     Calculator ca2 = (x) -> (int)(Math.pow(x,2));
     // no need 括號.
     System.out.println(ca2.square(3)); // 9

     // what is this?
     Calculator ca3 = x -> 3;  // input anything-> output -> 3
     System.out.println(ca3.square(0));  // 3
     System.out.println(ca3.square(4));  // 3
  }
}
