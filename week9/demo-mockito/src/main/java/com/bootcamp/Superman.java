package com.bootcamp;

public class Superman {
  
  private Cat cat;

  public Superman(Cat cat){
    this.cat = cat;
  }

  public int sum(int x){
    if (this.cat.sum(x, 10) + this.cat.subtract(100, x) > 5) {
      return 99;
    }
    return 50;
  }
  public static void main(String[] args) {
    System.out.println("hello");
  }
}
