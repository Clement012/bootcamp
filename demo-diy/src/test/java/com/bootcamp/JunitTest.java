package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bootcamp.junit.Junit;

public class JunitTest {

  @Test // Calculation -> Equals/notEquals
  void testSum(){
//Assertions.assertEquals(3,Junit.sum(1,2));
  assertEquals(3, Junit.sum(1,2));
  assertNotEquals(2, Junit.sum(0,1));
  }

  @Test // Sort
  void testSort(){
    
  }
  //@Test // String
}
