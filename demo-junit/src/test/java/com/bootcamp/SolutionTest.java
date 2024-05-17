package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// Testing Enviroment
@TestInstance(TestInstance.Lifecycle.PER_METHOD) //every x
public class SolutionTest {

  int x = 0;
  @BeforeAll
  static void initialize(){
    System.out.println("initialize()");
  }
  @BeforeEach // before each testing method
  void setup(){
    this.x = 100;
    System.out.println("setup()");
  }

  @Test
  void testX(){
    this.x++;
    assertEquals(101,this.x);
  }

  @Test
  void testX2(){ // new solutionTest in new test
    this.x++;
    assertEquals(101,this.x);
  }
  @Test
  void testSolution1(){
    assertEquals(2, new Solution().getTotalCount(List.of("abc","bccd")));
  }

  @Test
  void testSolution2(){
    assertEquals(0, new Solution().getTotalCount(List.of()));
  }
//  @AfterEach
//  void teardown(){
//    System.out.println("After");
//  }
  @AfterAll
  static void close(){
    System.out.println("Finish");
  }

  // How Maven handle Test Phrase? similar to [run]
  public static void main(String[] args) {
    SolutionTest st = new SolutionTest();
    st.testSolution1(); // success or fail
    SolutionTest st2 = new SolutionTest();
    st2.testSolution2(); // success or fail
    SolutionTest st3 = new SolutionTest();
    st3.testX(); // success or fail
    SolutionTest st4 = new SolutionTest();
    st4.testX2(); // success or fail
    // how many cases of success or failed?
  }
}
