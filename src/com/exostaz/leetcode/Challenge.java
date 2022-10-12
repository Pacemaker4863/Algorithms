package com.exostaz.leetcode;


import com.exostaz.leetcode.impl.ListNode;

import java.util.LinkedList;
import java.util.List;

public class Challenge {

    /**
     * Challenge 1672 Richest Customer
     */
    public int maximumWealth(final int[][] accounts) {
        int result = 0;
        int currentAccount;
        for (int[] customer : accounts) {
            currentAccount = 0;
            for (int account : customer) {
                currentAccount += account;
            }
            result = Math.max(currentAccount, result);
        }
        return result;
    }

    /**
     * 412. Fizz Buzz
     */
    public List<String> fizzBuzz(final int n) {
        List<String> result = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            boolean dividableBy3 = i % 3 == 0;
            boolean dividableBy5 = i % 5 == 0;

            if (dividableBy3) {
                stringBuilder.append("Fizz");
            }
            if (dividableBy5) {
                stringBuilder.append("Buzz");
            }
            if (stringBuilder.isEmpty()) {
                stringBuilder.append(i);
            }

            result.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
        return result;
    }

    public int numberOfSteps(int num) {
        int ops = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            ops++;
        }
        return ops;
    }

    public ListNode middleNode(ListNode head) {
        var listNode = new ListNode();

        return listNode;
    }
}
