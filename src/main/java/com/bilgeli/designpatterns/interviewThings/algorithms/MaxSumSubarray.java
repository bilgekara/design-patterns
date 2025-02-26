package com.bilgeli.designpatterns.interviewThings.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubarray {
    public static int findMaxSumSubarray(List<Integer> arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            currentRunningSum += arr.get(i);
            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= arr.get(i - (k - 1));
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 1, 7, 8, 1, 2, 8, 1, 0);
        int maxSumSubarray = findMaxSumSubarray(list, 3);
        System.out.println(maxSumSubarray);
    }
}
