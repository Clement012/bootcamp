package abstracts;

public class SuperCat extends SuperAnimal {

  private int age;

  public SuperCat (int age,String name){
    super(name);  // <- ?
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }

  @Override
  public void eat(){
    System.out.println("Cat is eating...");
  }

  @Override
  public void sit(){
    System.out.println("Cat is sitting...");
  }
  
  public static void main(String[] args) {
    SuperCat c = new SuperCat(3, "Jenny");
    System.out.println(c.getName());
    System.out.println(c.getAge());
    c.eat();
    c.sit();
  }
}
