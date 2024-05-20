package example;

class Animal{
  void eat(){
    System.out.println("An");
  }
}
class Cow extends Animal{
  void eat(String food){
    System.out.println("Co" + food );
  }
}
public class AnimalFarm {
  public static void main(String[] args) {
    Animal cow = new Cow();
    cow.eat("something");

    Animal cow2 = new Animal();
    cow2.eat("something");
  }
}
