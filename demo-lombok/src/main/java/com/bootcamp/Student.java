package com.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// Getter/Setter is a field/class annotation
@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
  @NonNull
  @Getter
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    Student s1 = new Student("Vincent", 10);
    System.out.println(s1.getName());
   // s1.setName("Vincent");

    s1.setAge(5);
  }
}
