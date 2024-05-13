package com.bootcamp.demo2403;

import java.lang.NullPointerException;

public class Cat {
  private String name;
  private int age;

  public Cat(String name, int age){
    if (name == null){
      throw new NullPointerException("name cannot be null when creating object");
    } else {
    this.name = name;
    this.age = age;
    }
  }
  public String getName(){
    return this.name;
  }
  public int age(){
    return this.age;
  }
  public static void main(String[] args) {
    Cat c = new Cat("Vincent", 10);
  }
}
