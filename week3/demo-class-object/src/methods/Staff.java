package methods;

public class Staff {
  
  // Attributes/Instance Variable
  private String name;
  
  private double salary;

  private int v; // 0
  
  public Staff(int v){
    this.v = v;
  }

  //分別: 
  //Constructor可以Private/可以Public
  //Static method must public
  //instance method -->use object to call

  //Constructor
  private Staff(String name){
    this.name = name;
  }
  // Static method
  public static Staff of (String name){
    return new Staff(name);
  }
  public static Staff peter(){
    return new Staff("Peter");
  }
  // instance method
  public double getSalary(){
    return this.salary;
  }


  public static void main(String[] args) {
    // Staff s1 = new Staff("John"); //private constructor
     
    // Static method
    Staff s2 = Staff.of("John");
    Staff s3 = Staff.peter();

    //Instance method
    double salary = s3.getSalary();  // every Staff object has its own salary

    // instance, means object
    Staff t = new Staff(3);
    System.out.println(t.sum(1,100)); 
    System.out.println(Staff.sum2(1,100));

    Staff2("Hello","world","ccc");
    Staff2(new String[] {"Hello","world","ccc"});
    Staff(new String[] {"Hello","world","ccc"});
    // Staff("Hello","world","ccc"); not ok 
  }

    // Instance method can access parameters + instance variable
    public int sum(int x,int y){  // method sum belongs to object
      return x + y + this.v;
    }

    // Static method cannot access parameters
    // but cannot access(read/write) instance variable (cannot use this here)
    public static int sum2(int x,int y){
      return x + y;
    }


    public static void Staff(String[] arr){

    }

    public static void Staff2(String... arr){

    }
    
}
