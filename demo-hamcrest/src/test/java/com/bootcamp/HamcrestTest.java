package com.bootcamp;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HamcrestTest {
  public static void main(String[] args) {
    String actualValue = "Hello";
    String expectedValue = "Hello";
    String expectedValue2 = "Hello2";

    
    // Junit 5
   // Assertion.assertEquals(s1, s2);
    assertEquals(actualValue, expectedValue);
  
    // Hamcrest
 // MatcherAssert.assertThat(s1, Matchers.equalTo(s2));
    assertThat(actualValue, is(equalTo(expectedValue)));
    assertThat(actualValue, is(not(equalTo(expectedValue2))));

    // NullValue Check
    String s1 = null;
    String s2 = "abc";
    assertThat(s1, is(nullValue()));
    assertThat(s2, is(notNullValue()));

    // Same instance
    String s3 = "hello";
    String s4 = "hello";
    String s5 = new String("hello");
    assertThat(s3, is(sameInstance(s4)));
    assertThat(s5, is(not(sameInstance(s4))));

    int value = 42;
    assertThat(value, allOf(
      greaterThan(41),
      greaterThanOrEqualTo(42),
      equalTo(42),
      lessThan(43),
      lessThanOrEqualTo(42)
    ));

    assertThat(value, anyOf(
      greaterThan(43),
      greaterThanOrEqualTo(42),  // onlyTrue.
      equalTo(41),
      lessThan(41),
      lessThanOrEqualTo(41)
    ));

    assertThat("hello", startsWith("h"));
    assertThat("hello", not(startsWith("l")));
    assertThat("hello", endsWith("o"));
    assertThat("hello", not(endsWith("l")));

    assertThat("hello", containsString("ll"));
    assertThat("hello", not(containsString("ll")));

    assertThat("hello", is(not(emptyString())));
    assertThat("", is((emptyString())));
  }
    @Test
    void testList(){
      List<String> wrongway = List.of("Apple","bana");
      // correct way
      List<String> strings = new ArrayList<>(List.of("Apple","bana"));
      List<String> strings2 = Arrays.asList("Apple","bana");

      assertThat(strings, hasSize(2));
      // check if contains all element and with order
      assertThat(strings, contains("Apple","bana"));
      assertThat(strings, not(contains("bana","Apple")));
      assertThat(strings, not(contains("or")));

      assertThat(strings, containsInAnyOrder("Apple","bana"));
      assertThat(strings, containsInAnyOrder("bana","Apple"));

      List<String> emptyList = new ArrayList<>();
      List<String> emptyList2 = Collections.emptyList();
      assertThat(emptyList, is(empty()));
      assertThat(strings, is(not(empty())));

      assertThat(strings, hasItem("bana"));
      assertThat(strings, hasItems("bana","Apple"));
    }
      @Test
      void testArray(){
        String[] arr = new String[]{"hello","abc"};
        assertThat(arr, arrayContaining("hello","abc"));
        assertThat(arr, not(arrayContaining("abc","hello")));

        assertThat(arr, arrayContainingInAnyOrder("hello","abc"));
        assertThat(arr, arrayContainingInAnyOrder("abc","hello"));
      }
      @Test
      void testTolerance(){
        double tolerance = 0.1d;
        double actual = 3.14159d; // 3.04159 < x <3.24158
        assertThat(actual, closeTo(3.11111 , tolerance));
        assertThat(actual, not(closeTo(3.0 , tolerance)));
        assertThat(actual, not(closeTo(3.25 , tolerance)));
        assertThat(actual, closeTo(3.24 , tolerance));
      }
      @Test
      void testInstanceOf(){
        Number number = Long.valueOf(13);
        assertThat(number, is(instanceOf(Long.class)));
        assertThat(number, is(instanceOf(Number.class)));

        assertThat(Long.class, typeCompatibleWith(Number.class));
      }
  }
  
