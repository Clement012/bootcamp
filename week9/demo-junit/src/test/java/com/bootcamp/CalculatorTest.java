package com.bootcamp;

// import org.junit.jupiter.api.Assertions; // Assertions. <- normally
import static org.junit.jupiter.api.Assertions.*; // static import //by hand

// shift+ctrl+o -> show all assertions below
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Duration;
import java.util.List;

// We can use static import to all static methods of the class
public class CalculatorTest{


  
  @Test
  void testSum(){
    int actual = Calculator.sum(3, 4);
    assertEquals(7 , actual);
    assertEquals(-10, Calculator.sum(-1, -9));
    assertEquals(0, Calculator.sum(0, 0));

    assertNotEquals(8, Calculator.sum(3,4));
  }

  // Test-Driven Design -> write test case ->then main 
  @Test
  void testSubtract() {
    assertEquals(8, Calculator.subtract(-1, -9));
    assertEquals(8, Calculator.subtract(10, 2));
    assertEquals(0, Calculator.subtract(2, 2));
  }

  @Test
  void testSort(){
    int[] arr = new int[]{2,4,3,1};
   // Assertions.assertEquals(arr, Calculator.sort(arr));
    Calculator.sort(arr);
    assertArrayEquals(new int[]{1,2,3,4}, arr);
    int[] arr2 = new int[] {};
   // Assertions.assertEquals(arr, Calculator.sort(arr));
    Calculator.sort(arr2);
    assertArrayEquals(new int[]{}, arr2);
  }

  @ParameterizedTest
  @CsvSource({
    "2,1,1",
    "100,49,51"
  })
  void testSumEquals(int expected,int x,int y){
    assertEquals(expected, Calculator.sum(x, y));
  }
//  @ParameterizedTest
//  @CsvSource({
//    "2,1,2",
//    "100,49,50"
//  })
//  void testSumNotEquals(int expected,int x,int y){
//    assertEquals(expected, Calculator.sum(x, y));
//  }

  @Test
  void testTimeOut() {
  // 500 ms -> 0.5sec
   assertTimeout(Duration.ofMillis(100), () -> {
    System.out.println("hello");
   });
  }

 
}
