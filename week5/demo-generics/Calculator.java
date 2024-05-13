public class Calculator<T extends Number> {

  private T x;  //instance method

  private T y;

  public double sum3(T x,T y){
    return x.doubleValue() + y.doubleValue();
  }

  public static int sum(int x, int y){  //static method
    return x + y;
  }


  public static double sum(double x, double y){
    return x + y;  // BigDecimal
  }

  // "< T extends Number>" implies x and y are the objects that
  // belongs to the class of Byte, Short, Integer, Long, Double, Float
  public static<T extends Number, Swim> double sum4(T x,T y){  // primitive? Wrapper Class?
    // Byte, Short, Integer, Long, Double, Float
    return x.doubleValue() + y.doubleValue(); //
  }
  public static double sum2(Number x,Number y){  
    return x.doubleValue() + y.doubleValue(); //
  }

  public static void main(String[] args) {
    System.out.println(sum(2,3));   // 5  int
    System.out.println(sum(2,3l));  // 5.0 long
    System.out.println(sum(2,3.3d)); // 5.3 double
    System.out.println(sum(2.3f, 3.2d)); // 5.499999952316284 -> BigDecimal

    // Compile-time -> Type-Safety
    // Limit the type range of x and y, so that x and y must be able to call doubleValue()

    // Run-time -> Polymorphism
    // sum(2.3f, 3.2d)
    // x.doubleValue() -> find the Float object in heap, we are calling the Float.doubleValue()

    System.out.println(sum2(3.4d,3l));  //6.4

    Calculator<Long> calculator = new Calculator<>();
    System.out.println(calculator.sum3(Long.valueOf(10),Long.valueOf(20)));

    Calculator.sum(3.2d,3.4d); //static method

    Calculator.sum4(new SuperLong(),new SuperLong());
  }
}
