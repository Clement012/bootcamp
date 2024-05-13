package maths;

public class Addition implements MathOperation{  // before

  @Override
  public double operate(double x, double y){
    return x + y;
  }
  
  public static void main(String[] args) {
    Addition addition = new Addition();
    System.out.println(addition.operate(100, 5));
  }
}
