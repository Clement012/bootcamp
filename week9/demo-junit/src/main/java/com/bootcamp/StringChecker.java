package com.bootcamp;

import java.util.List;

public class StringChecker {
  public static boolean isPalindrome(String s){
    //"racar"
    // StringBuilder -> reverse()
    
    return new StringBuilder(s).reverse().toString().equals(s);
  }
  public static String concat( List<String> strings){
     StringBuilder sb = new StringBuilder();
      for (String s : strings){
        sb.append(s);
      }
      return sb.toString();
    }
}
