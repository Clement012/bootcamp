package com.bootcamp;

public class Calculator {
  
  // dependency injection
  private int x;
  private Cat cat;

  public Calculator(int x, Cat cat){  // this cat object can be mocked 
    this.x = x;
    this.cat = cat;
  }

  public int sum(){
    return this.cat.sum(this.x, 10) + 3;
  }

    public static void main(String[] args) {
    Calculator calculator = new Calculator(8, new Cat());
    System.out.println(calculator.sum()); // 8 + 10 + 3
  }
}
