package com.bootcamp.parent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Car extends BigCar{ // remind constructor cant 繼承
  private String model;

  // AllArgsConstructor default in lombok
  // public car(String model){  
  //  super();
  //  this.car = car;
  // }
 
  // Custom Constructor 
  public Car(String model, double weight){  
    super(weight);
    this.model = model;
  }
public static void main(String[] args) {
    Car car = new Car("TSLA");  //AllargsConstructor
    car.setWeight(10.0);
    System.out.println(car.toString());
  }
}

