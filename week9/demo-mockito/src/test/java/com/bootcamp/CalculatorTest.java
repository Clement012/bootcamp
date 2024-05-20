package com.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)  // inject a set of annoution
public class CalculatorTest {
  
  @Mock
  private Cat mockedcat;

  @Test
  void testCalculatorSum(){
    // Let/ assume "new Cat(8,10).sum()", return 100
    // cat.sum() testing already completed in CatTest.java
    // so, calculator.sum() should focus on it own logic (something + 3)
    Mockito.when(this.mockedcat.sum(8, 10)).thenReturn(100);

    Calculator calculator = new Calculator(8, mockedcat);
    int result = calculator.sum(); // --> new Cat(8,10).sum()
    assertEquals(103,result); // not 21

    // verify() is to ensure calculator.sum() had called cat.sum().
    // checking 
    verify(this.mockedcat, times(1)).sum(8,10);
  //verify(this.cat, times(2)).sum(8,10);
  //verify(this.cat, times(1)).sum(9,10);
  }
}