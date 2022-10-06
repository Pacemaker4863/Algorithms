package com.exostaz.leetcode.chapter01;

public class SlidingWindow {

  public double findMaxAverage(int[] nums, int k) {
    double sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    double res = sum;
    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k];
      res = Math.max(res, sum);
    }
    return res / k;
  }

  public int longestOnes(int[] nums, int k) {
    int longestOnes = 0, left = 0, currentOnes = 0;
    for (int right = 0; right < nums.length && currentOnes < nums.length - left; right++) {
      if (nums[right] == 0) {
        k--;
      }
      currentOnes++;
      if (k < 0) {
        if (nums[left] == 0) {
          k++;
        }
        left++;
        currentOnes--;
      }
      longestOnes = Math.max(longestOnes, currentOnes);
    }
    return longestOnes;
  }

  public long zeroFilledSubarray(int[] nums) {
    long ans = 0, numSubarray = 0;
    for (int num : nums) {
      numSubarray = num == 0 ? numSubarray + 1 : 0;
      ans += numSubarray;
    }
    return ans;
  }

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0, j = i + 1; i < nums.length + 1; i++, j = i + 1) {
      while (i < j && j < nums.length) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        } else {
          j++;
        }
      }
    }
    return null;
  }

}
