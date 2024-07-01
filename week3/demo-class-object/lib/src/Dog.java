public class Dog {

    private String firstName;
    private String lastName;
    private int age;

    public Dog(){}; // Empty Constructor

    // All argument Constructor
    public Dog(String firstName, String lastName, int age){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age; }

    public String getfirstName(){
      return this.firstName;}
    public void setFirstName(String firstName){
      this.firstName = firstName;}
    public String getlastName(){
      return this.lastName;}
    public void setLastName(String lastName){
      this.lastName = lastName;}
    public int getAge(int age){
      return this.age;}
    public void setAge(int age){
      this.age = age;}
    
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
    
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
    System.out.println(dog.toString()); // "Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName());
    Dog dog4 = new Dog("Ken", "Wong" , 13); // (firstName=Ken lastName=Wong, age=13)
    System.out.println(dog4.toString());

    Square square = new Square();
    square.setLength(13);
    System.out.println(square.toString());  //"Square(length=13)"
    System.out.println(square.area());  //169

  }
}