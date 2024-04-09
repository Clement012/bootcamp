public class Dog {

    //

    private String firstName;

    private String lastName;

    private int age;

    public void setFirstName(String firstName){
      this.firstName = firstName;
    }

    public String getfirstName(){
      return this.firstName;
    }
    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    public String getlastName(){
      return this.lastName;
    }
    public void setAge(int age){
      this.age = age;
    }
    
    public String fullName(){
      return this.firstName.concat(" ").concat(this.lastName);
    }

    public String toString(){
      return "Dog("
      + "firstName=" + this.firstName
      + " lastName=" + this.lastName
      + ", age=" + this.age
      + ")";
    }
    

    //
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
    System.out.println(dog.toString()); // "Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName());
    

    Square square = new Square();
    square.setLength(13);
    System.out.println(square.toString2());  //"Square(length=13)"
    System.out.println(square.area());  //169
  }
}