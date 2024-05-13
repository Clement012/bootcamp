package src;

public class Child implements Parent{

  @Override
  public static void display(){
    System.out.println("subclass");
  }
  public static void main(String[] args) {
    Parent.display();  // Superclass
    Child.display();   // Childclass

   // Parent parent = new Child();
   // parent.display();  // Superclass / use Parent class call method.
  }
}
