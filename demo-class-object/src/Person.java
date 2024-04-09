public class Person {

  private int age;
  
  private double salary;

  // getter amd setter for age

  public void setAge(int age){
    this.age =age;
  }

  public int getAge(){
    return this.age;
  }
  
  public boolean isElderly(){
    return this.age >= 65;

  }

  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(65);
    System.out.println(p.isElderly());  //true

    Person p2 = new Person();
    p2.setAge(64);
    System.out.println(p2.isElderly());  //false

    
  }
}
