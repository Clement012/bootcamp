package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringCheckerTest {
  
   @Test
  void testIsPalindrome(){
    assertTrue(StringChecker.isPalindrome("racar"));
    assertFalse(StringChecker.isPalindrome("raca"));
  }
  
   @Test
   void testSameString(){
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse (s1 == s2);
    assertNotSame(s1,s2); // assertNotSame -> Not same object

    String s3 = "hello";  // Literal pool
    assertSame(s1,s3);
    assertEquals(s2,s3);
    }
    @Test 
    void testConcat(){  //concat call in main
     // List<String> strings = new ArrayList<>(List.of("abc","def","ghi"));
     // String result = String.join("",strings);  
     // assertEquals(("abcdefghi"),result);
     assertEquals(new String("abcdefijk"),
           StringChecker.concat(List.of("abc","def","ijk")));
    
   }
  
}
