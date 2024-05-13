package animal;

public class Animal {

  public static String x = "abc";

  private String name;

  public Animal(){
    System.out.println("Hello");
  }

  public Animal(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
   }
  public void setName(String name){
    this.name = name;

////  public void sleep(){
 //   System.out.println("Sleep...");
 // }
   public String lowerY(){
    return Cat.y.toLowerCase();
   }
  }
  public static void main(String[] args) {
    Cat cat = new Cat(12);
    cat.setName("Anna");
    Cat c2 = new Cat(4, "Vincent");
    System.out.println(cat.getName());
    System.out.println(c2.getName()); 

    // Cat has its own instance variable
    cat.setAge(10);
    System.out.println(cat.getAge());
    // Another child class extends Animal
  }
}
