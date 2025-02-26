package com.bilgeli.designpatterns.interviewThings.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        //Given an array of integers, find maximum sum subarray of the required size.
        List<Integer> input = Arrays.asList(-1, 2, 3, 1, -3, 2);
        int subarraySize = 2;
        System.out.println(findMaxSubArray(input, subarraySize));

        //Given an array of positive integers, find the subarrays that add up to a given number.
        List<Integer> input2 = Arrays.asList(1, 7, 4, 3, 1, 2, 1, 5, 1);
        int desiredSum = 7;
        System.out.println(findDesiredSumSubarray(input2, desiredSum));

        //Given an array of O's and 1's, find the maximum sequence of continuous 1's that can be formed by flipping at-most k O's to 1's.
        List<Integer> input3 = Arrays.asList(0, 1, 0, 1, 0, 0, 1, 1);
        int maxFlip = 2;
        System.out.println(maxSequenceFinder(input3, maxFlip));

        //Given a string and n characters, find the shortest substring that contains all the desired characters.
        String input4="fa4chba4c";
        String desiredCharacters ="abc";
        System.out.println(getShortestSubstring(input4,desiredCharacters));

    }

    private static String getShortestSubstring(String input, String desiredCharacters) {
        int missingCharCount = desiredCharacters.length();

        HashMap<Character,Integer> desiredCharactersMap=new HashMap<>();

        for (char c : desiredCharacters.toCharArray()) {
            desiredCharactersMap.put(c, desiredCharactersMap.getOrDefault(c, 0) + 1);
        }

        int windowStart=0;
        int smallestWindowStartIndex = 0, smallestWindowEndIndex = 0;

        for(int windowEnd=0;windowEnd<input.length();windowEnd++){
            char charAtEnd = input.charAt(windowEnd);

            //fda-afgbvc-dgdabf
            //bir karakter bulundu a-1,b0c,0
            if (desiredCharactersMap.containsKey(charAtEnd)){
                if(desiredCharactersMap.get(charAtEnd)>0){
                    missingCharCount--;
                }
                desiredCharactersMap.put(charAtEnd, desiredCharactersMap.get(charAtEnd) - 1);
            }

            if (missingCharCount == 0){
                char leftChar = input.charAt(windowStart);
                while (windowStart < windowEnd &&
                        (!desiredCharactersMap.containsKey(leftChar) ||desiredCharactersMap.get(leftChar)<0)){
                    if(desiredCharactersMap.containsKey(leftChar)){
                        desiredCharactersMap.put(leftChar, desiredCharactersMap.get(leftChar) + 1);
                    }
                    windowStart++;
                    leftChar = input.charAt(windowStart);
                }
                if (smallestWindowEndIndex == 0 || (windowEnd - windowStart) < (smallestWindowEndIndex - smallestWindowStartIndex)) {
                    smallestWindowStartIndex = windowStart;
                    smallestWindowEndIndex = windowEnd;
                }

            }

        }

        return input.substring(smallestWindowStartIndex, smallestWindowEndIndex + 1);

    }

    private static List<Integer> maxSequenceFinder(List<Integer> input, int maxFlip) {
        int maxSize = Integer.MIN_VALUE;
        int counter = 0;
        int windowStart = 0;

        int longestSubArrStart = 0;
        int longestSubArrEnd = 0;

        for (int windowEnd = 0; windowEnd < input.size(); windowEnd++) {
            if (input.get(windowEnd) == 0) {
                counter++;
            }

            while (counter > maxFlip) {

                if (input.get(windowStart) == 0)
                    counter--;
                windowStart++;
            }

            int windowSize = windowEnd - windowStart + 1;
            if (windowSize > maxSize) {
                maxSize = windowSize;
                longestSubArrStart = windowStart;
                longestSubArrEnd = windowEnd;
            }
        }


        return new ArrayList<>(input.subList(longestSubArrStart, longestSubArrEnd + 1));

        /*List<Integer> result = new ArrayList<>();
        for (int i = longestSubArrStart; i <= longestSubArrEnd; i++) {
            result.add(input.get(i));
        }
        return result;*/
    }

    private static List<List<Integer>> findDesiredSumSubarray(List<Integer> input, int desiredSum) {
        int currentSum = 0;
        int windowStart = 0;
        List<List<Integer>> solutions = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            currentSum += input.get(i);

            while (currentSum > desiredSum) {
                currentSum -= input.get(windowStart);
                windowStart++;
            }

            if (currentSum == desiredSum) {
                List<Integer> subarray = new ArrayList<>();
                for (int j = windowStart; j <= i; j++) {
                    subarray.add(input.get(j));
                }
                solutions.add(subarray);
            }
        }
        return solutions;
    }

    private static int findMaxSubArray(List<Integer> input, int subarraySize) {
        int maxValue = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < input.size(); i++) {
            currentSum += input.get(i);
            if (i >= subarraySize - 1) {
                maxValue = Math.max(maxValue, currentSum);
                currentSum -= input.get(i - (subarraySize - 1));
            }
        }
        return maxValue;
    }
}
