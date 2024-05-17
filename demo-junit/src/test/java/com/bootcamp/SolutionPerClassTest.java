package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


 // every 
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // in same x
@TestMethodOrder(OrderAnnotation.class) // there is no ordering else u use @Order
public class SolutionPerClassTest {
  int x = 0;

  @BeforeAll
  void setup(){
    this.x =100;
  }
  
  @Test
  @Order(1)
  void testX(){
    this.x++;
    assertEquals(101,this.x);
  }

  @Test
  @Order(2) 
  void testX2(){ // new solutionTest in new test
    this.x++;
    assertEquals(102,this.x);
  }
  public static void main(String[] args) {
    SolutionPerClassTest st = new SolutionPerClassTest();
    st.x = 100;
    st.testX();  // beforeEach
    st.testX2();  //beforeEach
    System.out.println("x=" + st.x);
  }
}