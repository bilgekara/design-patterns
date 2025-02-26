package com.bilgeli.designpatterns.interviewThings.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class LeetcodeProblems {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ali");
        student.setYas(67);

        Student student2 = new Student();
        student2.setName("furkan");
        student2.setYas(22);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);

        List<Student> collect = studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getYas(), s2.getYas()))
                .collect(Collectors.toList());

        List<Student> collect3 = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getYas))
                .collect(Collectors.toList());




        Map<Integer, List<Student>> groupedAndSortedStudents = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getYas, // Yaşlarına göre gruplandır
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Student::getName)) // İsimlerine göre sırala
                                        .collect(Collectors.toList())
                        )
                ));
        List<Integer> input = Arrays.asList(2, 3, 1, 2, 4, 3);
        int desiredSum = 7;
        System.out.println(minimumSizeSubarraySum(input, desiredSum));

        String input2 = "abcabcbb";
        lengthOfLongestSubstringWithoutRpeatingCharacters(input2);

        String input1 = "eceba";
        //String input2 ="ccaabbb";
        String input3 = "cfabadajac";
        lengthOfLongestSubstringTwoDistinct(input3);


    }
    static class Student{
        String name;
        int yas;
         void setYas(int value){
             this.yas=value;
         }
         int getYas(){
             return yas;
         }
         void setName(String name){
             this.name=name;
         }
         String getName(){
             return name;
         }
    }

    private static void lengthOfLongestSubstringWithoutRpeatingCharacters(String input) {
        int maxSize = Integer.MIN_VALUE;
        int windowstart = 0;
        Map<Character, Integer> keyValuePair = new HashMap<>();
        for (int windowend = 0; windowend < input.length(); windowend++) {
            char charEnd = input.charAt(windowend);
            keyValuePair.put(charEnd, keyValuePair.getOrDefault(charEnd, 0) + 1);
            while (keyValuePair.size()!=windowend-windowstart+1){
                char leftChar = input.charAt(windowstart);
                keyValuePair.put(leftChar, keyValuePair.getOrDefault(leftChar, 0) - 1);
                if (keyValuePair.get(leftChar) == 0)
                    keyValuePair.remove(leftChar);
                windowstart++;

            }

            maxSize = Math.max(maxSize, windowend - windowstart + 1);

        }
    }

    private static void lengthOfLongestSubstringTwoDistinct(String input1) {
        Map<Character, Integer> keyValuePair = new HashMap<>();
        int windowStart = 0;
        int maxSize = Integer.MIN_VALUE;
        for (int windowend = 0; windowend < input1.length(); windowend++) {
            char charAtEnd = input1.charAt(windowend);
            keyValuePair.put(charAtEnd, keyValuePair.getOrDefault(charAtEnd, 0) + 1);
            while (keyValuePair.size() > 2) {
                char leftChar = input1.charAt(windowStart);
                keyValuePair.put(leftChar, keyValuePair.getOrDefault(leftChar, 0) - 1);
                if (keyValuePair.get(leftChar) == 0)
                    keyValuePair.remove(leftChar);
                windowStart++;
            }
            maxSize = Math.max(maxSize, windowend - windowStart + 1);
            /*while (keyValuePair.get(charAtEnd)>1){
                maxSize= Math.max(maxSize,windowend-windowStart+1);
                char leftChar=input1.charAt(windowStart);
                if(keyValuePair.containsKey(leftChar)){
                    keyValuePair.put(leftChar,keyValuePair.getOrDefault(leftChar,0)-1);
                }
                windowStart++;
            }*/
        }
    }

    private static List<Integer> minimumSizeSubarraySum(List<Integer> input, int desiredSum) {
        int minSize = Integer.MAX_VALUE;
        int currentSum = 0;
        int windowStart = 0;
        List<Integer> minSubarray = new ArrayList<>();

        for (int windowend = 0; windowend < input.size(); windowend++) {
            currentSum += input.get(windowend);
            while (currentSum >= desiredSum) {
                if (currentSum == desiredSum) {
                    int windowSize = windowend - windowStart + 1;
                    if (windowSize < minSize) {
                        minSize = windowSize;
                        minSubarray = new ArrayList<>(input.subList(windowStart, windowend + 1));
                    }
                }
                currentSum -= input.get(windowStart);
                windowStart++;
            }

        }
        return minSubarray;
    }
}
