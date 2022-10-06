package com.exostaz.leetcode.chapter01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoPointersTest {

  private TwoPointers solution;

  @BeforeEach
  void setUp() {
    solution = new TwoPointers();
  }

  @Test
  void reverseString() {
    char[] hello = { 'h', 'e', 'l', 'l', 'o', ' ', 'R', 'o', 'n', 'a', 'l', 'd' };
    solution.reverseString(hello);
    String reverseString = new String(hello);
    assertArrayEquals(reverseString.toCharArray(),
                      new char[] { 'd', 'l', 'a', 'n', 'o', 'R', ' ', 'o', 'l', 'l', 'e', 'h' });
  }

  @Test
  void maxArea() {
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    assertEquals(49, solution.maxArea(height));

    height = new int[] { 1, 3, 2, 5, 25, 24, 5 };
    assertEquals(24, solution.maxArea(height));

    height = new int[] { 1, 1 };
    assertEquals(1, solution.maxArea(height));
  }
}
