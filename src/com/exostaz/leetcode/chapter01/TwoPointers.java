package com.exostaz.leetcode.chapter01;

public class TwoPointers {

  public void reverseString(char[] s) {
    int i = 0;
    int j = s.length - 1;
    while (i <= j) {
      char temp = s[j];
      s[j--] = s[i];
      s[i++] = temp;
    }
  }

  public int maxArea(int[] height) {
    int maxArea = 0;
    int leftIndex = 0;
    int rightIndex = height.length - 1;

    while (leftIndex < rightIndex) {
      int leftHeight = height[leftIndex];
      int rightHeight = height[rightIndex];
      int area = Math.min(leftHeight, rightHeight) * (rightIndex - leftIndex);
      maxArea = Math.max(maxArea, area);

      if (leftHeight < rightHeight) {
        while (height[leftIndex] <= leftHeight && leftIndex < rightIndex) {
          leftIndex++;
        }
      } else {
        while (height[rightIndex] <= rightHeight && leftIndex < rightIndex) {
          rightIndex--;
        }
      }
    }
    return maxArea;
  }
}
