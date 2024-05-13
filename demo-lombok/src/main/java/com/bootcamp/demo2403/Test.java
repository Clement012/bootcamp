package com.bootcamp.demo2403;

import java.time.LocalDate;

public class Test {
  public static void main(String[] args) {
    Staff s = new Staff("Vincent", LocalDate.of(2012,01,02));
    Staff s2 = new Staff("Vincent", LocalDate.of(2012,01,03));

    System.out.println(s.toString());
    System.out.println(s2.toString());

    System.out.println(s.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s == s2);
    System.out.println(s.equals(s2));

    Dog dog = new Dog("Vincent", 20);
    System.out.println(dog.toString());
    Dog dog2 = new Dog();
    System.out.println(dog2.toString());

    //Order order = new Order("01");    // <-- if no this line = false
    // in order class -> toString& tohashCode
    Customer c1 = new Customer("Vincent");
    c1.add(new Order("01"));
    Customer c2 = new Customer("Vincent");
    c2.add(new Order("01"));

    System.out.println(c1.equals(c2));  // true
    System.out.println(c1.orderCount());

    Staff t1 = Staff.builder()
      .name("Vincent")
      .joinDate(LocalDate.of(2013,04,30))
      .build();

    System.out.println(t1.toString());
  }
}
