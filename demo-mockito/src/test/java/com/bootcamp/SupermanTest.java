package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)  
public class SupermanTest {
  
  @Spy
  private Cat cat; // mocked cat, but with all implementation by default

  @InjectMocks  // something like calling the constructor bt putting the mocked cat as param
  private Superman superman;
  
  @Test
  void testSum(){
    Mockito.when(cat.sum(8, 10)).thenReturn(6);
    assertEquals(99,superman.sum(8));
    verify( cat, times(1)).sum(8,10);
  }
  @Test
  void testSum2(){
    Mockito.when(cat.sum(9, 10)).thenReturn(5);
    assertEquals(50,superman.sum(9));
    verify( cat, times(1)).sum(9,10);
  }
}
 

