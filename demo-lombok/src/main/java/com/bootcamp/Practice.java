package com.bootcamp;

//Revise definition 
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull; //inside the class
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @RequiredArgsConstructor
// @AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Practice{
  @NonNull 
  private String sportsName;
  private double time;
  public static void main(String[] args) {
    Practice p = new Practice();
    p.setSportsName("Bball");
    p.setTime(20.0);
    System.out.println(p.toString());

    Practice p2 = new Practice();
    p2.setSportsName("Football");
    System.out.println(p2.toString());
  }
}