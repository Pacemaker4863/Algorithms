package com.exostaz.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChallengeTest {

    private Challenge challenge;

    @BeforeEach
    void setUp() {
        challenge = new Challenge();
    }

    @Test
    void maximumWealth() {
        int[][] accounts = {{1, 2, 3, 8}, {3, 2, 1, 7}};
        assertEquals(14, challenge.maximumWealth(accounts));
    }

    @Test
    void fizzBuzz() {
        List<String> s1 = Arrays.asList("1", "2", "Fizz");
        assertEquals(s1, challenge.fizzBuzz(3));

        List<String> s2 = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(s2, challenge.fizzBuzz(5));

        List<String> s3 = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(s3, challenge.fizzBuzz(15));
    }

    @Test
    void numberOfSteps() {
        assertEquals(6, challenge.numberOfSteps(14));
        assertEquals(4, challenge.numberOfSteps(8));
        assertEquals(12, challenge.numberOfSteps(123));
    }

}
