package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Annotations
@AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Dog {
  private String name;
  private int age;

  public Dog (String name){
    this.name = name;
  }
  public Dog(){
    this.name = "Sally";
    this.age = 3 * 3;
  }

  public static void main(String[] args) {
    
  }
}
