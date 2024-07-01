

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat extends Animal{  // ? only in generic 
  // ? can super && extend
  // T can only extend 

  // You have to understand the different between :   26/4 hw1
  // 1. <T extends Animal> void addCat4(List<T> cats)  ->List<Cat>    
  // 2. void addCat(List<? super Cat> cats)  -> List<Cat> or List<RedCat>
  public static <T extends Animal> void addCat4(List<T> cats){  // List<Animal>, and(new Cat()), add new RedCat

  }
 
  public static void addCat(List<? super Cat> cats){  // List<Cat> or List<Animal>
    // compile time check 
    cats.add(new Cat());  // Ok
    cats.add(new RedCat()); // Ok

  //cats.add(new Animal()); //?
  // because compiler does not know the list type is List<Cat> or List<Animal>
  // so, during the compile-time, you cant add Animal(), coz it may wrong
    
  }
  
  public static void addCat2(List<Cat> cats){  // Cat or below

  }

  public static <T extends Cat> void addCat3(List<T> cats){  // Cat or below

  }
  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(),new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));  //?

   // addCat2(new ArrayList<>(List.of(new Animal(),new Animal()))); //
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));

    List<RedCat> rl = new ArrayList<>(List.of(new RedCat(),new RedCat()));
  //addCat2(rl);  //compile-time check -> check type of object reference

    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));  // OK why?
    // new ArrayList<>(List.of(new RedCat(), new RedCat()) -> because it can be stored in List<Cat> and List<Animal>

    List<Cat> cats = new LinkedList<>();
    cats.add(new RedCat());
    cats.add(new Cat());
  //cats.add(new Animal());
    addCat4(cats);

    List<RedCat> redCats = new LinkedList<>();
    addCat4(redCats);

    List<Animal> animals = new LinkedList<>();
    addCat4(animals);
    animals.add(new Animal());
  }
}
