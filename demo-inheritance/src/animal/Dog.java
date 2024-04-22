package animal;

public class Dog extends Animal{
 
  public Color color;

  public void setColor(Color color){
    this.color = color;
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setColor(Color.BLACK);
    dog.setName("Sally");
    System.out.println(dog.getName());
  }
 // private int age;
 // public static int ageLimit;
 // public void setAge(int Age){
 //   this.age = age;}
 // public int age(){
 //   return age;}
  
}
