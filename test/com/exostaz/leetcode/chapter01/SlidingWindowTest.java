package com.exostaz.leetcode.chapter01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SlidingWindowTest {

  private SlidingWindow slidingWindow;

  @BeforeEach
  void setUp() {
    slidingWindow = new SlidingWindow();
  }

  @Test
  void findMaxAverage() {
    assertEquals(12.75000, slidingWindow.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4));
    assertEquals(5.00000, slidingWindow.findMaxAverage(new int[] { 5 }, 1));
    assertEquals(-1.00000, slidingWindow.findMaxAverage(new int[] { -1 }, 1));
  }

  @Test
  void longestOnes() {
    int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
    int k = 3;
    assertEquals(10, slidingWindow.longestOnes(nums, k));

    nums = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    k = 2;
    assertEquals(6, slidingWindow.longestOnes(nums, k));
  }

  @Test
  void zeroFilledSubarray() {
    int[] nums = { 1, 3, 0, 0, 2, 0, 0, 4 };
    assertEquals(6, slidingWindow.zeroFilledSubarray(nums));
    nums = new int[] { 0, 0, 0, 2, 0, 0 };
    assertEquals(9, slidingWindow.zeroFilledSubarray(nums));
    nums = new int[] { 2, 10, 2019 };
    assertEquals(0, slidingWindow.zeroFilledSubarray(nums));
  }

  @Test
  void twoSum() {
    int[] nums = { 2, 7, 11, 15 };
    int[] expected = { 0, 1 };
    assertTrue(Arrays.equals(expected, slidingWindow.twoSum(nums, 9)));
    nums = new int[] { 3, 2, 4 };
    expected = new int[] { 1, 2 };
    assertTrue(Arrays.equals(expected, slidingWindow.twoSum(nums, 6)));
    nums = new int[] { 3, 3 };
    expected = new int[] { 0, 1 };
    assertTrue(Arrays.equals(expected, slidingWindow.twoSum(nums, 6)));
  }

}
