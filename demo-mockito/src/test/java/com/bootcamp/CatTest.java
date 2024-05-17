package com.bootcamp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest{

  @Test
  void testSum(){
    assertEquals(10, new Cat().sum(5,5));
    assertEquals(800, new Cat().sum(300,500));
    assertEquals(-1, new Cat().sum(5,-6));
    assertEquals(0, new Cat().sum(0,0));
  }
}