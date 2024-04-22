public class YYY {
  // public / private -> 
  // public all can see and use
  // private only can use in this program

  // this definition?
  
  // Attributes
  // Variable
  public static final int HOURS_OF_DAY = 24; //class --> common thing /can get every class
  private final int DAYS_OF_YEAR = 365; //object  //both of final variable is UPPERCASE
  private String name; //instance 
  private static int ageLimit; //static 

  // Constructor

  // Getter/Setter -> name
  private void setName(String name){
    this.name = name;
  }
  private String getName(){
    return this.name;
  }

  // Method 
  // Static method
  // Instance method 
  

  // Output
  public static void main(String[] args){
    System.out.println(YYY.HOURS_OF_DAY);  //<- static final
    //System.out.println(YYYpractice.DAYS_OF_YEAR);
    YYY.ageLimit = 10;  //<- static variable
    System.out.println(YYY.ageLimit);
    
    // Arrays.toString()
    // 
  }
}
