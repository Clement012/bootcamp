package src.objects;

import java.time.LocalDate;

public class Staff { // 1. All class implicitly extends Topmost class "Object"
  
  private LocalDate joinDate;

  public Staff(LocalDate joinDate){
    this.joinDate = joinDate;
  }

  public LocalDate getJoinDate(){
    return this.joinDate;
  }
  public void setJoinDate (LocalDate joinDate){
    this.joinDate = joinDate;
  }

  // 2. Every class should implement/override its own toString()
  @Override
  public String toString(){
    return "Staff("
     + "JoinDate= "  + this.joinDate
     + ")";
  }

  public static void main(String[] args) {
    Object object = new Object();
    System.out.println(object.toString());  // java.lang.Object@4517d9a3

    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString());  // objects.Staff@a09ee92
    // after adding to String method, print "Staff(JoinDate= 2024-04-17)"

    Staff s2 = new Staff(LocalDate.now());
    System.out.println(s2.toString()); // objects.Staff@30f39991
    // after adding to String method, print "Staff(JoinDate= 2024-04-17)"
    System.out.println(s == s2); // false
    System.out.println(s.getJoinDate().equals(s2)); //false?
    System.out.println(s.getJoinDate().compareTo(s2.getJoinDate())); // 0
    
    String str = "hello";
    System.out.println(str.toString()); // hello

    Integer i = 10;
    System.out.println(i.toString()); // "10"


  }
}
