package com.bilgeli.designpatterns.interviewThings.algorithms;

import java.util.Arrays;
import java.util.List;

public class SmallestSubarrayGivenSum {
    public static int smallestSubarray(List<Integer> arr, int targetSum) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowstart = 0;

        for (int windowend = 0; windowend < arr.size(); windowend++) {
            currentWindowSum += arr.get(windowend);

            while (currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowend - windowstart + 1);
                currentWindowSum -= arr.get(windowstart);
                windowstart++;
            }
        }
        return minWindowSize;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 2, 2, 7, 8, 1, 2, 8, 10);
        int targetSum = 8;
        int smallestSubarray = smallestSubarray(input, targetSum);
        System.out.println(smallestSubarray);
    }
}
