package maths;

@FunctionalInterface
public interface MathOperation {  // after

  double operate(double x, double y);

  static double calculate(int x, int y, MathOperation formula){  //encapsulation
    return formula.operate(x, y);
  }
  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtract = (a, b) -> a - b;
    MathOperation multply = (a, b) -> a * b;
    MathOperation divide = (a, b) -> a / b;

    System.out.println(MathOperation.calculate(100, 5, divide));
    System.out.println(MathOperation.calculate(100, 5, addition));
    System.out.println(MathOperation.calculate(100, 5, subtract));
    System.out.println(MathOperation.calculate(100, 5, multply));

  }
}
