package methods;

import java.util.Arrays;

public class Square{

  public static int sum(int x, int y){ //static method 
    return x + y;
  }

  public static String concat(String x, String y){ //static method
    return x + y;
  }

  public static void addOne(short[] arr){
    for (int i = 0; i < arr.length; i++){
      arr[i] = arr[i] + 1;
    }
  }

  public static void main(String[] args) {
    // pass by value -> primitives, wrapper class object, String object
    // pass by reference -> all tppes of array object, custom class object

    int a = 4;
    int b = 7;
    int r1 = sum(a, b);  //passing copy of values of a and b
    System.out.println(r1);  // 11 
    //after sum(), a = 4,b = 7 r1 =11

    String s1 = "hello";
    String s2 = "world";
    String r3 = concat(s1,s2); // passing copy of value of s1 and s2
    System.out.println(r3);
    // after concat(), s1 = "hello", s2 = "world", r3 ="Helloworld"

    
  }
}