package animal;

public class Cat extends Animal {  // inherit Animal ->Child class

  

  private int age;

  private String name;

  public Cat(){
    
  }

  // Child Class Cat object inherit all instance variables, instance methods from Parent (Super) Class Animal object
  // but it does not inherit constructor

  public Cat(int age){
    super();   // create Animal's constructor
    this.age = age;
  }

  public Cat(int age, String name){
    // super(); // by default call super()
    super(name);
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  // Approach1
  public String getCatName(){
    return this.name;
  }
  public void setCatName(String name){
    this.name = name;
  }

  // Approach2
  public String getAnimalName(){
    return super.getName();
  }

  public String upperX() {
    return Animal.x.toUpperCase();
  }

  // @Override
  public void sleep(){  //Method signature is same as the Animal object sleep()
    System.out.println("Cat is Sleeping...");  
  }

  public static void main(String[] args) {
    Cat cat = new Cat(12);
    Cat c3 = new Cat(16);
    c3.setName("Andrew");
    System.out.println(c3.getName()); // Andrew
    Cat c4 = new Cat(23, "Vincent");
    c4.setCatName("Mike");
    System.out.println(c4.getCatName()); // Mike
    System.out.println(c4.getAnimalName());  // Vincent

    System.out.println(Animal.x.toUpperCase());
  }

  //cat.sleep();
}
