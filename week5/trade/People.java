package week5.trade;

import java.util.HashMap;

public class People {

  private String name;
  // peopleMap 
  //name;
  //money;
  // your price?
  
  public static void main(String[] args) {
    HashMap<Double , String> peopleMap = new HashMap<>();
    peopleMap.put(50.0d,"Clement");   // buy if <=1.8
    peopleMap.put(20.0d,"Tommy" );  // buy if <= 1.4
    peopleMap.put(1.2d,"Vincent");  // buy 1.0
    peopleMap.put(12.0d,"Charles");  // buy <2.0
    peopleMap.put(16.0d, "John");  // buy anyPrice
    System.out.println(peopleMap);

    
  }
}
