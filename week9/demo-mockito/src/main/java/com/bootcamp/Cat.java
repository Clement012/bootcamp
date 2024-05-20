package com.bootcamp;

public class Cat {
    
//  private int x;
//  private int y;

//  public Cat (int x,int y){
//    this.x = x;
//    this.y = y;
//  }
public int sum(int x,int y){
  System.out.println("sum" + (x + y));
  return x + y;
}
public int subtract(int x,int y){
  System.out.println("sum" + (x - y));
  return x - y;
}
public static void main(String[] args) {
//   Cat cat = new Cat(1,3);
//   System.out.println(cat.sum());
 System.out.println(new Cat().sum(8, 10));
 System.out.println(new Cat().subtract(4,3));
  }
}


