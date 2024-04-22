package objects;

import java.awt.Color;

public class Person {
  private Dog dog;

  public Dog getDog(){
    return this.dog;
  }
  
  public void setDog(Dog dog){
  this.dog = dog;

  }
//  constructor is missing 
  public static void main(String[] args) {
    Person vincent = new Person();
    vincent.setDog(new Dog(Color.BLACK));

    Dog vincentDog1 = vincent.getDog();
    System.out.println(vincentDog1.getColor());

    vincent.setDog(new Dog(Color.RED));

    Dog vincentDog2 = vincent.getDog();
    System.out.println(vincentDog2.getColor());

    Person oscar = new Person();
    oscar.setDog(new Dog(Color.RED));

    Dog oscarDog = oscar.getDog();
  }
}
