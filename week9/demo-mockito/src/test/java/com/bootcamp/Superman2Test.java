package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)  
public class Superman2Test {
  
  @Mock
  private Cat cat; 

  @InjectMocks  
  private Superman superman;
  
  @Test
  void testSum() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(2);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  @Test
  void testSum2() {
    // mocked 2 behaviors
    when(cat.sum(98, 10)).thenReturn(3);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(50, superman.sum(98));
    verify(cat, times(1)).sum(98, 10);
    verify(cat, times(1)).subtract(100, 98);
  }

  
}
