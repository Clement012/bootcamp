package src.abstracts.abstracts;

public abstract class SuperAnimal extends SuperObject {  //1. you cannot create an object for SuperAnimal

  private String name;

  //  2. Abstract class is still having constructor, even you cant create an object for an abstract
  public SuperAnimal(){  
    // super();
  }

  public SuperAnimal(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setName (String name){
    this.name = name;
  }

  public abstract void eat();  // 3. Abstract method, but it is a method signature ONLY.
  // the child class has to implement it

  // 4. Automatically inherits abstract method from parent abstract class
 
  public void sleep(){
    System.out.println("Sleep");
  }

  public void run(){
    System.out.println("run");
  }

  public final void Swim(){
    System.out.println("Swim");
  }
  public static void main(String[] args) {
  ///  SuperAnimal sa = new SuperAnimal() ;
  }

}
