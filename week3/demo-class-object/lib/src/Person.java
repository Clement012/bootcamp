public class Person {

  private int age;
  
  // private double salary;

  // getter amd setter for age
  public Person() {

  }
  // default empty constructor
  // if add downstairs -> default disappear -> also add upstairs
  public Person(int age){
    this.age = age;
  }

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
    Person p = new Person();  // constructor
    p.setAge(65);
    System.out.println(p.isElderly());  //true

    Person p2 = new Person();
    p2.setAge(64);
    System.out.println(p2.isElderly());  //false

  
  // can keep 
   Person p3 = new Person(3);
   boolean result = p3.isElderly(); 
   System.out.println(p3.isElderly());
   // cant keep
   boolean isElderly = new Person(65).isElderly();
  }
}
